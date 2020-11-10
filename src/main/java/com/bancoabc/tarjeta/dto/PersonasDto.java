package com.bancoabc.tarjeta.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class PersonasDto {
    private Long id;
    private String nombre;
    private String apellido;
    private String correo;
    private TarjetasDto tarjetas;
}
