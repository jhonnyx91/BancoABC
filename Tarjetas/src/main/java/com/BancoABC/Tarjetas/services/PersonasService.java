package com.BancoABC.Tarjetas.services;

import com.BancoABC.Tarjetas.dto.PersonasDto;
import com.BancoABC.Tarjetas.dto.TarjetasDto;
import com.BancoABC.Tarjetas.model.Dao.IPersonasDao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonasService implements IPersonasService {

    @Autowired
    private IPersonasDao personasDao;

    @Override
    public List<PersonasDto> getPersonas() {
        return personasDao.findAll()
                .stream()
                .map(entity -> {
                    TarjetasDto tarjetas= new TarjetasDto();
                    BeanUtils.copyProperties(entity.getTarjetas(),tarjetas);
                    return new PersonasDto(
                            entity.getId(),
                            entity.getNombre(),
                            entity.getApellido(),
                            entity.getCorreo(),
                            tarjetas
                    );
                }).collect(Collectors.toList());
    }
}
