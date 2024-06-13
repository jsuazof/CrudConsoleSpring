package com.example.crudconsola.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.crudconsola.entities.Especialidad;

public interface EspecialidadRepository extends CrudRepository<Especialidad, Integer> {

    @Query("SELECT e FROM Especialidad e")
    public List<Especialidad> getEspecialidades();

    @Query("SELECT esp FROM Especialidad esp WHERE esp.id_especialidad in ?1")
    public Optional<Especialidad> getEspecialidadPorId(Integer id);


}
