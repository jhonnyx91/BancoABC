package com.bancoabc.tarjeta.services;


import com.bancoabc.tarjeta.dto.TarjetasDto;

import java.util.List;

public interface ITarjetasService {

    List<TarjetasDto> getTarjetas();

}