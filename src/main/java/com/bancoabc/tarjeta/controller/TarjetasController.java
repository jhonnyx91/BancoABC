package com.bancoabc.tarjeta.controller;


import com.bancoabc.tarjeta.dto.TarjetaDto;
import com.bancoabc.tarjeta.repository.TarjetaRepository;
import com.bancoabc.tarjeta.services.ITarjetasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api")
public class TarjetasController {
    @Autowired
    private ITarjetasService TarjetasService;

    @Autowired
    private TarjetaRepository itarjetasDao;

    @GetMapping(value = "/tarjeta")
    public List<TarjetaDto> getTarjetas() {
        return TarjetasService.getTarjetas();
    }
}
