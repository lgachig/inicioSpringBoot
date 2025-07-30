package uce.edu.ec.iniciospringboot.Controller;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
