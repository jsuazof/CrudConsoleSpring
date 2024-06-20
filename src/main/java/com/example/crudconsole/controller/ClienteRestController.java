package com.example.crudconsole.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudconsole.entity.Cliente;
import com.example.crudconsole.service.ClienteService;

//localhost:8080/api/clientes
@RestController
@RequestMapping("/api/clientes")
public class ClienteRestController {

    @Autowired
    private ClienteService service;

    @GetMapping
    public List<Cliente> list()
    {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> view(@PathVariable Integer id)
    {
        Optional<Cliente> clienteOptional = service.findById(id);
        if(clienteOptional.isPresent())
         //true
        {
            return ResponseEntity.ok(clienteOptional.orElseThrow());
        }

        return ResponseEntity.notFound().build();
    }
/*
    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody Cliente cliente, BindingResult result)
    {




    }
*/
}