package com.example.crudconsole.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.crudconsole.entity.Cliente;
import com.example.crudconsole.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
     @Autowired
    private ClienteRepository clienteRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {

        return (List<Cliente>)clienteRepository.findAll();
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<Cliente> findById(Integer id) {
        return clienteRepository.findById(id);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Optional<Cliente> update(Integer id, Cliente cliente) {
        return Optional.empty();
    }

    @Override
    public Optional<Cliente> delete(Integer id) {
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);
        clienteOptional.ifPresent(clienteDb->{
            clienteRepository.delete(clienteDb);
        });
        return clienteOptional;
    }
    



}
