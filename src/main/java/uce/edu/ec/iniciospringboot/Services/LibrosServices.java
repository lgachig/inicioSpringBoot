package uce.edu.ec.iniciospringboot.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uce.edu.ec.iniciospringboot.Model.Autor;
import uce.edu.ec.iniciospringboot.Model.Libros;
import uce.edu.ec.iniciospringboot.Repository.AutorRepository;
import uce.edu.ec.iniciospringboot.Repository.LibrosRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LibrosServices {

    @Autowired
    private LibrosRepository librosRepository;

    public List<Libros> findAll() {
        return librosRepository.findAll();
    }

    public Optional<Libros> findById(int id) {
        return librosRepository.findById(id);
    }

    public Libros save(Libros libros) {
        return librosRepository.save(libros);
    }

    public void delete(int id) {
        librosRepository.deleteById(id);
    }

    public Libros update(int id, Libros libros){
        Libros librosExiste = librosRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Libro no exiteste" + id) );
        return librosRepository.save(librosExiste);
    }
}
