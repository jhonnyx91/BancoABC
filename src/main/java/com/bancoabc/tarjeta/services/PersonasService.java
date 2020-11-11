package com.bancoabc.tarjeta.services;

import com.bancoabc.tarjeta.dto.PersonaDto;
import com.bancoabc.tarjeta.dto.TarjetaDto;
import com.bancoabc.tarjeta.model.dao.IPersonasDao;
import com.bancoabc.tarjeta.model.dao.ITarjetasDao;
import com.bancoabc.tarjeta.model.entitys.Persona;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonasService implements IPersonasService {

    @Autowired
    private IPersonasDao personasDao;

    @Autowired
    private ITarjetasDao tarjetasDao;

    @Override
    public List<PersonaDto> getPersonas() {
        List<Persona> personas = personasDao.findAll();
        return personasDao.findAll()
                .stream()
                .map(entity -> new PersonaDto(
                        entity.getId(),
                        entity.getNombre(),
                        entity.getApellido(),
                        entity.getCorreo(),
                        tarjetasDao.findAllByPersona(new Persona(entity.getId())).stream().map(
                                e -> {
                                    TarjetaDto tarjeta = new TarjetaDto();
                                    BeanUtils.copyProperties(e, tarjeta);
                                    return tarjeta;
                                }
                        ).collect(Collectors.toList())
                )).collect(Collectors.toList());
    }
}
