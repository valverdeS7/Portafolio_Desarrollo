package com.tienda_v1.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "producto")

public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Producto")

    private Long idProducto;

    private String descripcion;
    private String rutaImagen;
    private Boolean activo;

    public Producto() {
    }

    public Producto(String descripcion, Boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

    public boolean isActivo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
