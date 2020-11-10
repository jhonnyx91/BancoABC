package com.BancoABC.Tarjetas.model.entitys;

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
@Table(name = "Personas")
public class Personas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "correo")
    private String correo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tc", referencedColumnName = "id")
    private Tarjetas tarjetas;
}
