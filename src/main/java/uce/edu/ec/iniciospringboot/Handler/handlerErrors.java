package uce.edu.ec.iniciospringboot.Handler;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// Clase para manejar errores
// @controller advice sirve para manejar errores
@ControllerAdvice
public class handlerErrors {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<String> handlerArithmeticException(ArithmeticException e){
        return new ResponseEntity<>("Error: division gggg", HttpStatus.BAD_REQUEST);
    }


}
