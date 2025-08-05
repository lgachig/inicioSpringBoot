package uce.edu.ec.iniciospringboot.interceptores;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.Calendar;

@Component
public class calendario implements HandlerInterceptor {

    @Value("${config.calendar.open}")
    private int open;

    @Value("${config.calendar.close}")
    private int close;


    @Override
   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       Calendar calendario = Calendar.getInstance();
       System.out.println("Hora actual: " + open + " - " + close);
       int hora = calendario.get(Calendar.HOUR_OF_DAY);

       if(hora >= open || hora <= close) {
           System.out.println("Hora aceptada");
           StringBuilder mensaje = new StringBuilder("Bienvenido a la plataforma");
           request.setAttribute("mensaje", mensaje.toString());
           return true;
       }
       return false;

   }

   @Override
   public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

   }


}
