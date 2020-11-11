package com.bancoabc.tarjeta.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class PersonaDto {
    private Long id;
    private String nombre;
    private String apellido;
    private String correo;
    private List<TarjetaDto> tarjetas;
}
