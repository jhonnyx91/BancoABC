package com.bancoabc.tarjeta.model.dao;

import com.bancoabc.tarjeta.model.entitys.Persona;
import com.bancoabc.tarjeta.model.entitys.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITarjetasDao extends JpaRepository<Tarjeta, Long> {

    List<Tarjeta> findAllByPersona(Persona persona);

}