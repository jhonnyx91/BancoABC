package com.BancoABC.Tarjetas.Controller;

import com.BancoABC.Tarjetas.dto.PersonasDto;
import com.BancoABC.Tarjetas.model.Dao.IPersonasDao;
import com.BancoABC.Tarjetas.services.IPersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Bancoabc")
public class PersonasController {

    @Autowired
    private IPersonasService PersonasService;

    @Autowired
    private IPersonasDao ipersonasDao;

    @GetMapping(value = "personas")
    public List<PersonasDto> getPersonas() {
        return PersonasService.getPersonas();
    }


}

