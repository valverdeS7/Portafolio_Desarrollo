package com.tienda_v1.service;

import com.tienda_v1.domain.Categoria;
import java.util.List;

public interface CategoriaService {

    public List<Categoria> getCategorias(boolean activo);

}
