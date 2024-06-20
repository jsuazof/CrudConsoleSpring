package com.example.crudconsole.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.crudconsole.entity.Especialidad;

public interface EspecialidadRepository extends
        CrudRepository<Especialidad,Integer> {
    //select * from especilidad
    @Query("select e from Especialidad e")
     List<Especialidad> getEspecialidades(); //listando especialidades

    //select * from especialidad where id_especialidad = 5

    @Query("select esp from Especialidad esp where esp.idEspecialidad in ?1 ")
    Optional<Especialidad> getEspecialidadPorId(Integer id);



}
