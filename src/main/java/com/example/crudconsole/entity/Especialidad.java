package com.example.crudconsole.entity;

import java.util.Set;
import jakarta.persistence.*;

@Entity
@Table(name = "especialidad")
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_especialidad")
    private Integer idEspecialidad;

    @Column(name = "nombre_especialidad", columnDefinition = "varchar(25)", nullable = false)
    private String nombreEspecialidad;

    @Column(name = "descripcion_especialidad", columnDefinition = "varchar(100)", nullable = false)
    private String descripcionEspecialidad;

    @ManyToMany(mappedBy = "especialidades")
    private Set<Profesional> profesionales;

    public Integer getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(Integer idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public String getDescripcionEspecialidad() {
        return descripcionEspecialidad;
    }

    public void setDescripcionEspecialidad(String descripcionEspecialidad) {
        this.descripcionEspecialidad = descripcionEspecialidad;
    }

    public Set<Profesional> getProfesionales() {
        return profesionales;
    }

    public void setProfesionales(Set<Profesional> profesionales) {
        this.profesionales = profesionales;
    }

    // Getters and setters
}
