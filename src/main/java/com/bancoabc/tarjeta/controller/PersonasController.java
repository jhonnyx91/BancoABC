package com.bancoabc.tarjeta.controller;

import com.bancoabc.tarjeta.dto.Mensaje;
import com.bancoabc.tarjeta.dto.PersonaDto;
import com.bancoabc.tarjeta.model.dao.IPersonasDao;
import com.bancoabc.tarjeta.model.entitys.Persona;
import com.bancoabc.tarjeta.services.IPersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api")
public class PersonasController {

    @Autowired
    private IPersonasService PersonasService;

    @Autowired
    private IPersonasDao ipersonasDao;

    @GetMapping(value = "/personas")
    public List<PersonaDto> getPersonas() {
        return PersonasService.getPersonas();
    }

    @PostMapping(value = "/addpersona")
    public PersonaDto getPersonas(@RequestBody PersonaDto persona) {
        return PersonasService.addPersona(persona);
    }
}

