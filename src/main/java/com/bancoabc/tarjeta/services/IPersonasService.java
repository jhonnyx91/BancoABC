package com.bancoabc.tarjeta.services;

import com.bancoabc.tarjeta.dto.PersonaDto;

import java.util.List;

public interface IPersonasService {

    public List<PersonaDto> getPersonas();

    PersonaDto addPersona(PersonaDto nuevaPersona);

}