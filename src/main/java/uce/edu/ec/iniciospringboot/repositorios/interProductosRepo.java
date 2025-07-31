package uce.edu.ec.iniciospringboot.repositorios;

import uce.edu.ec.iniciospringboot.Models.Productos;

import java.util.List;

public interface interProductosRepo {

    List<Productos> getProductos();
    Productos getPrductoId(int id);
}
