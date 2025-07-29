package uce.edu.ec.iniciospringboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uce.edu.ec.iniciospringboot.Models.DTO.ClaseDTO;
import uce.edu.ec.iniciospringboot.Models.Empleados;

import java.util.HashMap;
import java.util.Map;

// RequestMapping serve para indicar que es una url que se va a usar para acceder a este metodo
@RequestMapping("Api")
@RestController
public class EjemploRestController {

    @GetMapping("/Informacion")
    public Map<String, Object> getEmpleados(){
        Empleados empleado = new Empleados("Juan", "Perez", "Elluis@uce.edu.ec", "999999999", 25);
        Empleados empleado1 = new Empleados("Juan", "Perez", "Elluis@uce.edu.ec", "999999999", 25);

        Empleados[] Gerencia = {empleado, empleado1};

        Map<String, Object> map = new HashMap<>();
        map.put("Descripcion", "lista de empleados");
        map.put("Data", Gerencia);
        return map;
    }

    // getClaseDTO devuelve un objeto de tipo ClaseDTO

    @GetMapping("/DTOInformacion")
    public ClaseDTO getClaseDTO(){
        ClaseDTO claseDTO = new ClaseDTO();
        claseDTO.setTitulo("Clase DTO");
        claseDTO.setUsuario("Juan");
        return claseDTO;
    }
}
