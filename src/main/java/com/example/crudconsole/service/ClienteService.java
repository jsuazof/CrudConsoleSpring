package com.example.crudconsole.service;

import java.util.List;
import java.util.Optional;

import com.example.crudconsole.entity.Cliente;

public interface ClienteService {

    List<Cliente>findAll();
    
    Optional<Cliente>findById(Integer id);

    Cliente save(Cliente cliente);

    Optional<Cliente> update(Integer id, Cliente cliente);

    Optional<Cliente> delete(Integer id);
}
