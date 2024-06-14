
package com.example.crudconsola.entity;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "profesional")
@Getter
@Setter
@NoArgsConstructor
@ToString

public class Profesional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profesional")
    private Integer idProfesional;

    @Column(name="password_profesional", nullable = false, columnDefinition= "varchar(12)")
    private String passwordProfesional;

    @Column(name= "nombre_profesional", nullable = false, columnDefinition= "varchar(20)")
    private String Profesional;

    @Column(name= "apellido1_profesional", nullable = false, columnDefinition= "varchar(25)")
    private String apellido1Profesional;

    @Column(name= "nacionalidad_profesional", nullable = false, columnDefinition= "varchar(50)")
    private String nacionalidadProfesional;

    @Column(name= "fnac_profesional", nullable = false, columnDefinition= "date")
    private Date fnacProfesional;

    @Column(name= "sexo_profesional", nullable = false, columnDefinition="int")
    private Integer sexoProfesional;

    @Column(name = "direccion_profesional",nullable = false, columnDefinition = "varchar(50)" )
    private String direccionProfesional;

    @Column(name = "comuna_profesional", nullable = false, columnDefinition = "varchar(25)")
    private String comunaProfesional;

    @Column(name = "email_profesional", nullable = false, columnDefinition = "varchar(50)")
    private String emailProfesional;
    
    @Column(name = "telefono_profesional", nullable = false, columnDefinition = "varchar(25)")
    private String telefonoProfesional;

    //relaciones

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "profesional_especialidad",
            joinColumns = @JoinColumn(name = "id_profesional"),
            inverseJoinColumns = @JoinColumn(name = "id_especialidad"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"id_profesional", "id_especialidad"})
    )
    private Set<Especialidad> especialidades;

    @OneToMany(mappedBy = "profesional")
    Set<Reserva>listaReservas;
}
