package com.example.crudconsole.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.CrudRepository;

import com.example.crudconsole.entity.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer>{

  @Query("select count(c) from Cliente c")
    Integer getTotalCliente();

    @Query(value = "select nombre_cliente, apellido1_cliente, apellido2_cliente " +
            "from cliente",nativeQuery = true)
    List<Cliente> listaClientes();

    @Query(value = "select * from cliente where cliente.sexo_cliente=:sexo",
            nativeQuery = true)
    List<Cliente> listaDeClientesPorSexo(@Param("sexo") Integer sexo);

    @Query("select c from Cliente c where c.idCliente=(select max(c.idCliente) from Cliente c)")
    Optional<Cliente> getLastRegistration();
    //me filtre a clientes por el sexo y por el identificador de documento en orden ascedente
    List<Cliente> findBySexoClienteOrderByIdentificadorDocumentoAsc(Integer sexo);
    //List<Cliente> findBySexoClienteOrderByIdentificadorDocumentoAsc(Integer sexo);
    /*
          SQL_nativo = "select *
          from cliente
          where sexo = 2
          order by identicador_documento asc"

    *
     */

}
