package com.bancoabc.tarjeta.services;

import com.bancoabc.tarjeta.dto.TarjetasDto;
import com.bancoabc.tarjeta.model.dao.ITarjetasDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TarjetasService implements ITarjetasService {

    @Autowired
    private ITarjetasDao TarjetasDao;

    @Override
    public List<TarjetasDto> getTarjetas() {
        return TarjetasDao.findAll()
                .stream()
                .map(entity -> new TarjetasDto(
                        entity.getId(),
                        entity.getNombre(),
                        entity.getFecha(),
                        entity.getCodigo()
                )).collect(Collectors.toList());
    }

}
