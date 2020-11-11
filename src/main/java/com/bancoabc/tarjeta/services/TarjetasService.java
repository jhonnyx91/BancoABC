package com.bancoabc.tarjeta.services;

import com.bancoabc.tarjeta.dto.PersonaDto;
import com.bancoabc.tarjeta.dto.TarjetaDto;
import com.bancoabc.tarjeta.model.dao.ITarjetasDao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TarjetasService implements ITarjetasService {

    @Autowired
    private ITarjetasDao TarjetasDao;

    @Override
    public List<TarjetaDto> getTarjetas() {
        return TarjetasDao.findAll()
                .stream()
                .map(entity -> {
                            PersonaDto personaDto = new PersonaDto();
                            BeanUtils.copyProperties(entity.getPersona(), personaDto);
                            return new TarjetaDto(
                                    entity.getId(),
                                    entity.getNombre(),
                                    entity.getFecha(),
                                    entity.getCodigo(), personaDto
                            );
                        }

                ).collect(Collectors.toList());
    }

}
