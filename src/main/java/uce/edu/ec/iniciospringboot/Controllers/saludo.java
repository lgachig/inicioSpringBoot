package uce.edu.ec.iniciospringboot.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class saludo {

    @RequestMapping("/hola")
    public String saludar() throws InterruptedException{
        Thread.sleep(5000);
        return "Hola mundo";
    }

}
