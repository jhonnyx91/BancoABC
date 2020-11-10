package com.bancoabc.tarjeta.controller;

import com.bancoabc.tarjeta.dto.PersonasDto;
import com.bancoabc.tarjeta.model.dao.IPersonasDao;
import com.bancoabc.tarjeta.services.IPersonasService;
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

