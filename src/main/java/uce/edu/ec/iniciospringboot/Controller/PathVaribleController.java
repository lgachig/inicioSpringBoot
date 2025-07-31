package uce.edu.ec.iniciospringboot.Controller;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import uce.edu.ec.iniciospringboot.Models.Empleados;

import java.util.Map;

@RestController
@RequestMapping("api/pathvar")
public class PathVaribleController {

    // @PathVariable indica que el parametro es un parametro de la url
    // ejemplo de como se envia el parametro en la url: http://localhost:8080/api/pathvar/prueba
    // retorna un objeto de tipo ParamDTO
    @GetMapping("/Pagina/{id}")
    public ParamDTO pathVarible(@PathVariable String id){
        ParamDTO paramDTO = new ParamDTO();
        paramDTO.setDetalle(id);
        return paramDTO;
    }

    // @RequestBody surve para indicar que el parametro es un objeto de tipo Empleados
    // retorna un objeto de tipo Empleados
    // sirve para enviar datos entre el cliente y el servidor mediante un objeto jSon
    @PostMapping("/solicitud")
    public Empleados solicitud(@RequestBody Empleados empleado){
        return empleado;
    }

    // @Value indica que el parametro es un valor de la configuracion
    @Value("${Congif.nombre}")
    private String nombre;

    @GetMapping("/informacion/pc")
    public Map<String, Object> informacionPc(){
        Map<String, Object> map = Map.of("Nombre", nombre);
        return map;
    }

}
