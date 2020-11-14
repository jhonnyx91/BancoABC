package com.bancoabc.tarjeta.repository;

import com.bancoabc.tarjeta.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}