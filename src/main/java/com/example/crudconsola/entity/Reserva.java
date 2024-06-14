package com.example.crudconsola.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserva")
    private  Integer idReserva;
    @Column(name = "fecha_reserva")
    private Date fechaReserva;
    @Column(name ="baja_reserva")
    private boolean bajaReserva;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL,orphanRemoval = true,mappedBy = "reserva")
    private Atencion atencion;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_profesional")
    private Profesional profesional;
}
