package uce.edu.ec.iniciospringboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uce.edu.ec.iniciospringboot.Models.Productos;
import uce.edu.ec.iniciospringboot.repositorios.interProductosRepo;

import java.util.List;
import java.util.stream.Collectors;

// los service sirven para manipular los datos de los repositorios
@Service
public class ServiceProductos implements interProductosServi {

    @Autowired
    private interProductosRepo repoProductos;

    @Override
    public List<Productos> getProductos(){
        return repoProductos.getProductos()
                .stream()
                .map(p -> {
                            Productos nuevos = (Productos) p.clone();
                            nuevos.setPrecio(p.getPrecio()*1.5d);
                            return nuevos;
                        }
                ).collect(Collectors.toList());
    }

    @Override
    public Productos getPrductoId(int id){
        return repoProductos.getPrductoId(id);
    }

}
