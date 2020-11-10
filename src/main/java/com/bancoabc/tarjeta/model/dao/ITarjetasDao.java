package com.bancoabc.tarjeta.model.dao;

import com.bancoabc.tarjeta.model.entitys.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITarjetasDao extends JpaRepository<Tarjeta, Long> {

}