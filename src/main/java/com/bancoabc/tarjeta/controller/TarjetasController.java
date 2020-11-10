package com.bancoabc.tarjeta.controller;


import com.bancoabc.tarjeta.dto.TarjetasDto;
import com.bancoabc.tarjeta.model.dao.ITarjetasDao;
import com.bancoabc.tarjeta.services.ITarjetasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Bancoabc")
public class TarjetasController {
    @Autowired
    private ITarjetasService TarjetasService;

    @Autowired
    private ITarjetasDao itarjetasDao;

    @GetMapping(value = "tarjeta")
    public List<TarjetasDto> getTarjetas() {
        return TarjetasService.getTarjetas();
    }
}
