package com.example.crudconsole.entity;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "cliente")
@Getter
@Setter
@NoArgsConstructor
@ToString

public class Cliente {

    public Cliente(Object object, String numeroDocumento, String nombre, String apellido, String nacionalidad,
            Date fecha, Integer genero, String direccion, String comuna, String email, String telefono,
            String password) {
        //TODO Auto-generated constructor stub
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer idCliente;
    
    @Column(name="tipo_documento_cliente", columnDefinition="int", nullable = false)
    private Integer tipoDocumentoCliente;

    @Column(name="identificador_documento", nullable = false, columnDefinition= "varchar(20)")
    private String identificadorDocumento;

    @Column(name="passord_cliente", nullable = false, columnDefinition= "varchar(12)")
    private String passwordCliente;

    @Column(name= "nombre_cliente", nullable = false, columnDefinition= "varchar(20)")
    private String Cliente;

    @Column(name= "apellido1_cliente", nullable = false, columnDefinition= "varchar(25)")
    private String apellido1Cliente;
    
    @Column(name= "apellido2_cliente", nullable = false, columnDefinition= "varchar(25)")
    private String apellido2Cliente;


    @Column(name= "nacionalidad_cliente", nullable = false, columnDefinition= "varchar(50)")
    private String nacionalidadCliente;

    @Column(name= "fnac_cliente", nullable = false, columnDefinition= "date")
    private Date fnacCliente;

    @Column(name= "sexo_cliente", nullable = false, columnDefinition="int")
    private Integer sexoCliente;

    @Column(name = "direccion_cliente",nullable = false, columnDefinition = "varchar(50)" )
    private String direccionCliente;

    @Column(name = "comuna_cliente", nullable = false, columnDefinition = "varchar(25)")
    private String comunaCliente;

    @Column(name = "email_cliente", nullable = false, columnDefinition = "varchar(50)")
    private String emailCliente;
    
    @Column(name = "telefono_cliente", nullable = false, columnDefinition = "varchar(25)")
    private String telefonoCliente;

    @OneToMany(mappedBy = "cliente")
    Set<Reserva>listaReservas;
  

}
