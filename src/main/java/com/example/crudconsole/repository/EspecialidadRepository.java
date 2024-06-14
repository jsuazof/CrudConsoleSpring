package com.example.crudconsole.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.crudconsole.entity.Especialidad;

public interface EspecialidadRepository extends JpaRepository<Especialidad, Integer> {

    @Query("SELECT e FROM Especialidad e")
    List<Especialidad> getEspecialidades();

    @Query("SELECT esp FROM Especialidad esp WHERE esp.idEspecialidad = ?1")
    Optional<Especialidad> getEspecialidadPorId(Integer id);
}
