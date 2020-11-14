package com.bancoabc.tarjeta.entity;

import com.bancoabc.tarjeta.entity.Persona;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "Tarjetas")
public class Tarjeta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fecha")
    private String fecha;

    @Column(name = "codigo")
    private Long codigo;

    @JoinColumn(name = "PERSONA", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.EAGER)
    private Persona persona;
}
