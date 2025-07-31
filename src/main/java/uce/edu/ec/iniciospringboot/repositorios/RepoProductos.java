package uce.edu.ec.iniciospringboot.repositorios;

import org.springframework.stereotype.Repository;
import uce.edu.ec.iniciospringboot.Models.Productos;

import java.util.Arrays;
import java.util.List;

// los repositorios son para acceder a la base de datos
@Repository
public class RepoProductos implements interProductosRepo{

    List<Productos> productos;

    public RepoProductos() {
        this.productos = Arrays.asList(
                new Productos( 1, "javon", 9.0),
                new Productos(2, "javon", 9.0),
                new Productos( 3, "javon", 9.0),
                new Productos( 4, "javon", 9.0)
        );
    }

    @Override
    public List<Productos> getProductos() {
        return productos;
    }

    @Override
    public Productos getPrductoId(int id){
        return productos.stream().filter(p -> p.getIdProducto() == id).findFirst().orElse(null);

    }


}
