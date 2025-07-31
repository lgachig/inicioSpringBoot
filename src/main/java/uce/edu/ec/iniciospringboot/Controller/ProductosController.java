package uce.edu.ec.iniciospringboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import uce.edu.ec.iniciospringboot.Models.Productos;
import uce.edu.ec.iniciospringboot.services.ServiceProductos;

import java.util.List;

@RestController
public class ProductosController {

    @Autowired
    public ServiceProductos serviceProductos;

    @GetMapping("productos")
    public List<Productos> getProductos(){
        return serviceProductos.getProductos();
    }

    @GetMapping("producto/{id}")
    public Productos getProductoId(@PathVariable int id){
        return serviceProductos.getPrductoId(id);
    }

}
