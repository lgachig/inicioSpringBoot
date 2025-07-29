package uce.edu.ec.iniciospringboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

// Devuelve un objeto JSON
@RestController
public class EjemploRestController {

    // Devuelve un objeto JSON Map
    // Map sirve para almacenar un conjunto de pares clave-valor
    @GetMapping("/rest")
    public Map<String, Object> rest(){
        Map<String, Object> map = new HashMap<>();
        map.put("mensaje", "Hola desde un rest");
        map.put("titulo", "Inicios Spring Boot");
        return map;
    }
}
