package com.bancoabc.tarjeta.controller;

import com.bancoabc.tarjeta.dto.PersonaDto;
import com.bancoabc.tarjeta.services.IPersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api")
public class PersonasController {

    @Autowired
    private IPersonasService PersonasService;

    @GetMapping(value = "/persona")
    public List<PersonaDto> getPersonas() {
        return PersonasService.getPersonas();
    }

    @PostMapping(value = "/persona")
    public PersonaDto getPersonas(@RequestBody PersonaDto persona) {
        return PersonasService.addPersona(persona);
    }
}

