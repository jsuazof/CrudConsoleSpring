package com.example.crudconsola.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "atencion")
public class Atencion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_atencion")
    private Integer idAtencion;

    @OneToOne
    @JoinColumn(name = "id_reserva")
    private  Reserva reserva;

    @Column(name = "diagnostico_atencion")
    private String dignosticoAtencion;

    @Column(name = "tratamiento_atencion",columnDefinition = "varchar(400)")
    private String tratamientoAtencion;
}
