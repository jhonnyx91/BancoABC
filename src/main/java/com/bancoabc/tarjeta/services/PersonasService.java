package com.bancoabc.tarjeta.services;

import com.bancoabc.tarjeta.dto.PersonaDto;
import com.bancoabc.tarjeta.dto.TarjetaDto;
import com.bancoabc.tarjeta.entity.Persona;
import com.bancoabc.tarjeta.repository.PersonaRepository;
import com.bancoabc.tarjeta.repository.TarjetaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonasService implements IPersonasService {

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private TarjetaRepository tarjetaRepository;

    @Override
    public List<PersonaDto> getPersonas() {
        List<Persona> personas = personaRepository.findAll();
        return personaRepository.findAll()
                .stream()
                .map(entity -> new PersonaDto(
                        entity.getId(),
                        entity.getNombre(),
                        entity.getApellido(),
                        entity.getCorreo(),
                        tarjetaRepository.findAllByPersona(new Persona(entity.getId())).stream().map(
                                e -> {
                                    TarjetaDto tarjeta = new TarjetaDto();
                                    BeanUtils.copyProperties(e, tarjeta);
                                    return tarjeta;
                                }
                        ).collect(Collectors.toList())
                )).collect(Collectors.toList());
    }

    @Override
    public PersonaDto addPersona(PersonaDto p) {
        Persona nuevaPersona = personaRepository.findById(p.getId() == null ? -1 : p.getId()).orElse(new Persona());
        nuevaPersona.setNombre(p.getNombre());
        nuevaPersona.setApellido(p.getApellido());
        nuevaPersona.setCorreo(p.getCorreo());
        personaRepository.save(nuevaPersona);
        return p;
    }
}
