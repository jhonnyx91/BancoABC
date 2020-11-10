package com.BancoABC.Tarjetas.Controller;


import com.BancoABC.Tarjetas.dto.TarjetasDto;
import com.BancoABC.Tarjetas.model.Dao.ITarjetasDao;
import com.BancoABC.Tarjetas.services.ITarjetasService;
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

    @GetMapping(value = "tarjetas")
    public List<TarjetasDto> getTarjetas() {
        return TarjetasService.getTarjetas();
    }
}
