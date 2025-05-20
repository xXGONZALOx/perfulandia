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

<<<<<<< Updated upstream
<<<<<<<< Updated upstream:src/main/java/com/perfulandia/cl/perfulandia/model/Cliente.java
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
    @Column(unique = true, length =  13, nullable = false )
    private String run;
========
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
>>>>>>>> Stashed changes:src/main/java/com/perfulandia/cl/perfulandia/model/cliente.java
=======
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
>>>>>>> Stashed changes
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellido;
    @Column(nullable = false)
    private String email;
<<<<<<< Updated upstream
<<<<<<<< Updated upstream:src/main/java/com/perfulandia/cl/perfulandia/model/Cliente.java
    @Column(nullable = true)
    private Date fechaNacimieto;
}
========
    @Column(unique = true,length = 13, nullable = false)
    private String run;

}
>>>>>>>> Stashed changes:src/main/java/com/perfulandia/cl/perfulandia/model/cliente.java
=======
    @Column(unique = true,length = 13, nullable = false)
    private String run;

}
>>>>>>> Stashed changes
