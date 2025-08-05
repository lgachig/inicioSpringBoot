package uce.edu.ec.iniciospringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uce.edu.ec.iniciospringboot.Repository.RepoPersona;
import uce.edu.ec.iniciospringboot.entidades.Persona;

import java.util.List;

@SpringBootApplication
public class InicioSpringBootApplication  {

    public static void main(String[] args) {
        SpringApplication.run(InicioSpringBootApplication.class, args);
    }

}
