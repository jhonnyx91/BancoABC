package com.bancoabc.tarjeta.repository;

import com.bancoabc.tarjeta.entity.Persona;
import com.bancoabc.tarjeta.entity.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TarjetaRepository extends JpaRepository<Tarjeta, Long> {

    List<Tarjeta> findAllByPersona(Persona persona);

}