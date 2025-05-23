package com.perfulandia.cl.perfulandia.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "item_venta")
@Data
@NoArgsConstructor
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "producto_id")
    private Producto producto;

    private int cantidad;

    private double precioUnitario;

    @ManyToOne
    @JoinColumn(name = "venta_id")
    private Venta venta;
}