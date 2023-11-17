package com.tienda_v1.dao;

import com.tienda_v1.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao
        extends JpaRepository<Producto, Long> {

    // lista de productos utilizando un metodo Query
    public List<Producto> findByPrecioBtweenOrderByDescripcion(double precioInf,
            double precioSup);

}
