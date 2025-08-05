package uce.edu.ec.iniciospringboot.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uce.edu.ec.iniciospringboot.Repository.RepoPersona;
import uce.edu.ec.iniciospringboot.entidades.Persona;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
public class PersonaControllers {

    @Autowired
    private RepoPersona repoPersona;

    @GetMapping("allPersons")
    private List<Persona> getAllPersons(){
        return (List<Persona>) repoPersona.findAll();
    }

}
