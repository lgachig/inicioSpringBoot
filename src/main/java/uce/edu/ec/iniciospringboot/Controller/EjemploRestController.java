package uce.edu.ec.iniciospringboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

// RequestMapping serve para indicar que es una url que se va a usar para acceder a este metodo
@RequestMapping("Api")
@RestController
public class EjemploRestController {

    @GetMapping("/Informacion")
    public Map<String, Object> rest(){
        Map<String, Object> map = new HashMap<>();
        map.put("mensaje", "Hola desde un rest");
        map.put("titulo", "Inicios Spring Boot");
        return map;
    }
}
