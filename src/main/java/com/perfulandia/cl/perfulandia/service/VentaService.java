package com.perfulandia.cl.perfulandia.service;

import com.perfulandia.cl.perfulandia.model.*;
import com.perfulandia.cl.perfulandia.repository.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;


@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Transactional
    public Venta save(Venta venta) throws Exception {

        // Verificar que el cliente exista
        Cliente cliente = clienteRepository.findById(venta.getCliente().getId())
                .orElseThrow(() -> new Exception("Cliente no encontrado"));

        venta.setCliente(cliente);
        venta.setFechaVenta(new Date());

        double total = 0;

        // Verificar productos y calcular total
        for (Venta item : venta.getItems()) {
            Producto producto = productoRepository.findById(item.getProducto().getId())
                    .orElseThrow(() -> new Exception("Producto no encontrado con id " + item.getProducto().getId()));

            // Actualizar el producto en el item para evitar problemas
            item.setProducto(producto);

            // Verificar stock suficiente
            if (producto.getStock() < item.getCantidad()) {
                throw new Exception("Stock insuficiente para producto " + producto.getNombre());
            }

            // Calcular subtotal item
            double subtotal = item.getCantidad() * producto.getPrecio();
            item.setPrecioUnitario(producto.getPrecio());

            total += subtotal;

            // Reducir stock producto
            producto.setStock(producto.getStock() - item.getCantidad());
            productoRepository.save(producto);
        }

        venta.setTotal(total);

        return ventaRepository.save(venta);
    }
}
