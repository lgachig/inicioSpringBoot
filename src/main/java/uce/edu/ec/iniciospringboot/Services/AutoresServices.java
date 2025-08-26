package uce.edu.ec.iniciospringboot.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uce.edu.ec.iniciospringboot.Model.Autor;
import uce.edu.ec.iniciospringboot.Repository.AutorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AutoresServices {

    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> findAll() {
        return autorRepository.findAll();
    }

    public Optional<Autor> findById(int id) {
        return autorRepository.findById(id);
    }

    public Autor save(Autor autor) {
        return autorRepository.save(autor);
    }

    public void delete(int id) {
        autorRepository.deleteById(id);
    }

    public Autor update(int id, Autor autor){
        Autor autorExiste = autorRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Autor no exiteste" + id) );
        return autorRepository.save(autorExiste);
    }

}
