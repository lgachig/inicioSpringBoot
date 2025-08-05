package uce.edu.ec.iniciospringboot.Controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class appControllers {

    @GetMapping("indice")
    public ResponseEntity<?> indice(HttpServletRequest request) {
        Map<String, Object> datos = new HashMap<>();
        datos.put("mensaje", "Hola mundo");
        datos.put("hora", new Date());
        datos.put("mensaje", request.getAttribute("mensaje"));
        return ResponseEntity.ok(datos);
    }

}
