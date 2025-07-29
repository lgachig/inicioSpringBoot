package uce.edu.ec.iniciospringboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// Devuelve una vista(html)
@Controller
public class EjemploController {

    // Usamos @GetMapping para indicar que es un metodo que se ejecuta cuando se hace una peticion GET a la url /
    // envia un mensaje a la vista Detalles_information.html mediante el atributo message
    @GetMapping("/")
    public String info(Model model){
        model.addAttribute("message", "Es mi primer hola");
        model.addAttribute("title", "Inicios Spring Boot");
        return "Detalles_information";
    }

}
