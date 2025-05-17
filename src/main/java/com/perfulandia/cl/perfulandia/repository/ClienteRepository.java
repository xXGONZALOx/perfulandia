package com.perfulandia.cl.perfulandia.repository;


import com.perfulandia.cl.perfulandia.model.Cliente;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ClienteRepository extends  JpaRepository<Cliente, Long> {

    List<Cliente> findByApellidos(String apellidos);

    Cliente findByCorreo(String correo);



}
