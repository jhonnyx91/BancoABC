package com.bancoabc.tarjeta.services;

import com.bancoabc.tarjeta.dto.PersonaDto;

import java.util.List;

public interface IPersonasService {

    List<PersonaDto> getPersonas();

    PersonaDto addPersona(PersonaDto nuevaPersona);

}