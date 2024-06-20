package com.example.crudconsole.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "cliente")
@Getter
@Setter
@NoArgsConstructor


public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Column(name = "tipo_documento_cliente", nullable = false,columnDefinition = "int")
    private Integer tipoDocumentoCliente;
    @Column(name = "identificador_documento")
    private String identificadorDocumento;
    @Column(name = "password_cliente", nullable = false, columnDefinition = "varchar(12)")
    private String passwordCliente;
    @Column(name = "nombre_cliente", nullable = false, columnDefinition = "varchar(20)")
    private String nombreCliente;
    @Column(name = "apellido1_cliente", nullable = false,columnDefinition = "varchar(25)")
    private String apellido1Cliente;
    @Column(name = "apellido2_cliente", nullable = false,columnDefinition = "varchar(25)")
    private String apellido2Cliente;
    @Column(name = "nacionalidad_cliente", nullable = false, columnDefinition = "varchar(50)")
    private String nacionalidadCliente;
    @Column(name = "fnac_cliente", nullable = false,columnDefinition = "date")
    private Date fnacCliente;
    @Column(name = "sexo_cliente", nullable = false, columnDefinition = "int")
    private Integer sexoCliente;
    @Column(name = "direccion_cliente", nullable = false, columnDefinition = "varchar(50)" )
    private String direccionCliente;
    @Column(name = "comuna_cliente", nullable = false, columnDefinition = "varchar(25)")
    private String comunaCliente;
    @Column(name = "email_cliente", nullable = false, columnDefinition = "varchar(50)")
    private String emailCliente;
    @Column(name = "telefono_cliente", nullable = false, columnDefinition = "varchar(25)")
    private String telefonoCliente;

    @OneToMany(mappedBy = "cliente")
    Set<Reserva> listaReservas;

    public Cliente(Integer idCliente, Integer tipoDocumentoCliente, String identificadorDocumento, String passwordCliente, String nombreCliente, String apellido1Cliente, String apellido2Cliente, String nacionalidadCliente, Date fnacCliente, Integer sexoCliente, String direccionCliente, String comunaCliente, String emailCliente, String telefonoCliente) {
        this.idCliente = idCliente;
        this.tipoDocumentoCliente = tipoDocumentoCliente;
        this.identificadorDocumento = identificadorDocumento;
        this.passwordCliente = passwordCliente;
        this.nombreCliente = nombreCliente;
        this.apellido1Cliente = apellido1Cliente;
        this.apellido2Cliente = apellido2Cliente;
        this.nacionalidadCliente = nacionalidadCliente;
        this.fnacCliente = fnacCliente;
        this.sexoCliente = sexoCliente;
        this.direccionCliente = direccionCliente;
        this.comunaCliente = comunaCliente;
        this.emailCliente = emailCliente;
        this.telefonoCliente = telefonoCliente;

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "telefonoCliente='" + telefonoCliente + '\'' +
                ", emailCliente='" + emailCliente + '\'' +
                ", comunaCliente='" + comunaCliente + '\'' +
                ", direccionCliente='" + direccionCliente + '\'' +
                ", sexoCliente=" + sexoCliente +
                ", fnacCliente=" + fnacCliente +
                ", nacionalidadCliente='" + nacionalidadCliente + '\'' +
                ", apellido2Cliente='" + apellido2Cliente + '\'' +
                ", apellido1Cliente='" + apellido1Cliente + '\'' +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", passwordCliente='" + passwordCliente + '\'' +
                ", identificadorDocumento='" + identificadorDocumento + '\'' +
                ", tipoDocumentoCliente=" + tipoDocumentoCliente +
                ", idCliente=" + idCliente +
                '}';
    }
}