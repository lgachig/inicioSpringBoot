package uce.edu.ec.iniciospringboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Devuelve una vista(html)
@Controller
public class EjemploController {

    // devuelve la vista Detalles_information
    @GetMapping("/")
    public String info(){
        return "Detalles_information";
    }

}
