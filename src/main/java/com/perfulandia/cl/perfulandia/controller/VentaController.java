package com.perfulandia.cl.perfulandia.controller;

import com.perfulandia.cl.perfulandia.model.Venta;
import com.perfulandia.cl.perfulandia.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/ventas")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @PostMapping
    public ResponseEntity<?> crearVenta(@RequestBody Venta venta) {
        try {
            Venta nuevaVenta = ventaService.save(venta);
            return new ResponseEntity<>(nuevaVenta, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Error al crear la venta: " + e.getMessage());
        }
    }
}
