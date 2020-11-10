package com.BancoABC.Tarjetas.model.Dao;

import com.BancoABC.Tarjetas.model.entitys.Tarjetas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITarjetasDao extends JpaRepository<Tarjetas, Long> {

}