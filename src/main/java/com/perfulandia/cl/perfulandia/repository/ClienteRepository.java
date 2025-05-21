package com.perfulandia.cl.perfulandia.repository;



import com.perfulandia.cl.perfulandia.model.Cliente;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ClienteRepository extends  JpaRepository<Cliente, Long> {

    @Query( value = "SELECT p FROM Cliente WHERE email = : email", nativeQuery = true)
    Cliente buscarPorEmail(@Param("email") String);


}



