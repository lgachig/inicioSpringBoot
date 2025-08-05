package uce.edu.ec.iniciospringboot.Repository;

import org.springframework.data.repository.CrudRepository;
import uce.edu.ec.iniciospringboot.entidades.Persona;

public interface RepoPersona extends CrudRepository<Persona, Long> {



}
