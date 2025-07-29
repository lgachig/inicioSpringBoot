package uce.edu.ec.iniciospringboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import uce.edu.ec.iniciospringboot.Models.Empleados;

import java.util.Arrays;
import java.util.List;


// Devuelve una vista(html)
@Controller
public class EjemploController {

    // info devuelve la vista detalle_information
    @GetMapping("/")
    public String info(){
        return "Detalles_information";
    }

    @ModelAttribute("Empleados")
    public List<Empleados> listEmpleados(){
        return Arrays.asList(
                new Empleados("Juan", "Perez",null, "999999999", 25),
                new Empleados("Juan", "Perez",null, "999999999", 25),
                new Empleados("Juan", "Perez",null, "999999999", 25),
                new Empleados("Juan", "Perez",null, "999999999", 25),
                new Empleados("Juan", "Perez",null, "999999999", 25)
        );
    }
}
