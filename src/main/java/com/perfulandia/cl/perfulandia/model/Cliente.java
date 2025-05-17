package com.perfulandia.cl.perfulandia.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table //("clienteee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;

    private String nombre;
    private String apellido;
    private String email;
    private String contraseña;





}
