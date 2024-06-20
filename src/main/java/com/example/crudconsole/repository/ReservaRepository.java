package com.example.crudconsole.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.crudconsole.entity.Reserva;

public interface ReservaRepository extends CrudRepository<Reserva,Integer> {

}