package com.example.crudconsola.entity;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "especialidad")
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_especialidad")
    private Integer idEspecialidad;

    @Column(name = "nombre_especialidad",columnDefinition = "varchar(25)",nullable = false)
    private String nombreEspecialidad;

    @Column(name = "descripcion_especialidad", columnDefinition = "varchar(100)",nullable = false)
    private String descripcionEspecialidad;

    @ManyToMany(mappedBy = "especialidades")
    private Set<Profesional>profesionales;

}
