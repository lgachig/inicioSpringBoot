package uce.edu.ec.iniciospringboot.services;

import uce.edu.ec.iniciospringboot.Models.Productos;

import java.util.List;

public interface interProductosServi {

    List<Productos> getProductos();
    Productos getPrductoId(int id);

}
