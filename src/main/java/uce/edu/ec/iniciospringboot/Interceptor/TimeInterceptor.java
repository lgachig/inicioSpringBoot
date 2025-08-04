package uce.edu.ec.iniciospringboot.Interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.io.Serializable;

public class TimeInterceptor implements HandlerInterceptor, Serializable {

    private static final String START_TIME = "inicio";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        long timpeInicial = System.currentTimeMillis();
        request.setAttribute(START_TIME, timpeInicial);
        return true;
    }

    @Override
    public void postHandle (HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception{
        long timpeFinal = System.currentTimeMillis();
        long timpeTotal = timpeFinal - (long) request.getAttribute(START_TIME);
        System.out.println("Tiempo total: " + timpeTotal + " milisegundos " + request.getRequestURI());
    }
}
