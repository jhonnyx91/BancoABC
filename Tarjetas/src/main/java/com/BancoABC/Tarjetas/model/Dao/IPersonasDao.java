package com.BancoABC.Tarjetas.model.Dao;

import com.BancoABC.Tarjetas.model.entitys.Personas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonasDao extends JpaRepository<Personas, Long> {

}