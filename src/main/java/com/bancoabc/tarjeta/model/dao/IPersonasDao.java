package com.bancoabc.tarjeta.model.dao;

import com.bancoabc.tarjeta.model.entitys.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonasDao extends JpaRepository<Persona, Long> {

}