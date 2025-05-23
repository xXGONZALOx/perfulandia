package com.perfulandia.cl.perfulandia.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Table //("clienteee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
    @Column(unique = true, length =  13, nullable = false )
    private String run;



    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellido;
    @Column(nullable = false)
    private String email;
    @Column(nullable = true)
    @Temporal(TemporalType.DATE)
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd")
    private Date fechaNacimiento;
}






