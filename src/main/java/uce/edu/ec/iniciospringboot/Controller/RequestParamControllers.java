package uce.edu.ec.iniciospringboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/param")
public class RequestParamControllers {

    // @RequestParam indica que el parametro es un parametro de la url
    // ejemplo de como se envia el parametro en la url: http://localhost:8080/api/param/detalle?detalle=prueba
    // retorna un objeto de tipo ParamDTO
    //
    @GetMapping("/detalle")
    public ParamDTO detalle(@RequestParam String detalle){
        ParamDTO paramDTO = new ParamDTO();
        paramDTO.setDetalle(detalle);
        return paramDTO;
    }

}
