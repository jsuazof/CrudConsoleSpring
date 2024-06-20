package com.example.crudconsole.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.crudconsole.entity.Cliente;
import com.example.crudconsole.service.ClienteService;

public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping("/lista-clientes")
    public String listaClientes(ModelMap model) {
       
        model.addAttribute("clientes", "lista de clientes");
        return "lista-clientes";
    }
    @ModelAttribute("clientes")
    public List<Cliente> clientesModel() {
        List<Cliente> clientes = service.findAll();
        return clientes;
    }
}
