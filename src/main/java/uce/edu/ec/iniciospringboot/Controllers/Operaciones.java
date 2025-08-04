package uce.edu.ec.iniciospringboot.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/operaciones")
public class Operaciones {

    @GetMapping
    public String Dividir(){
        return "Operaciones: " + 1/0;
    }

}
