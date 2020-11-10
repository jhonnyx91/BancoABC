package com.BancoABC.Tarjetas.services;

import com.BancoABC.Tarjetas.dto.PersonasDto;
import com.BancoABC.Tarjetas.dto.TarjetasDto;
import com.BancoABC.Tarjetas.model.Dao.ITarjetasDao;
import com.BancoABC.Tarjetas.model.entitys.Tarjetas;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TarjetasService implements ITarjetasService{

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
