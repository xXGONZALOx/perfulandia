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
public class cliente {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;



}
