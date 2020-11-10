package com.BancoABC.Tarjetas.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class TarjetasDto {
    private Long id;
    private String nombre;
    private String fecha;
    private long codigo;
}
