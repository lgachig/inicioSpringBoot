package uce.edu.ec.iniciospringboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import uce.edu.ec.iniciospringboot.Models.Empleados;

// Devuelve una vista(html)
@Controller
public class EjemploController {

    // info devuelve la vista detalle_information
    @GetMapping("/")
    public String info(Model model){
        Empleados empleado = new Empleados("Juan", "Perez", "Elluis@uce.edu.ec", "999999999", 25);
        model.addAttribute("Gerencia", empleado);

        return "Detalles_information";
    }

}
