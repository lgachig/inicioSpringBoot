package uce.edu.ec.iniciospringboot.Controllers;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uce.edu.ec.iniciospringboot.Model.Libros;
import uce.edu.ec.iniciospringboot.Services.AutoresServices;
import uce.edu.ec.iniciospringboot.Services.LibrosServices;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/libros")
public class LibrosControllers {

    @Autowired
    LibrosServices librosServices;

    @Autowired
    AutoresServices autoresServices;

    @GetMapping("")
    public List<Libros> getLibros(){
        return librosServices.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Libros> getLibro(@PathVariable int id){
        return new ResponseEntity<>(librosServices.findById(id).orElse(null), HttpStatus.OK);
    }

    @PostMapping("libro/save")
    public ResponseEntity<Libros> save(@RequestBody Libros libros){
        if (libros.getId() != null && libros.getId() == 0) {
            libros.setId(null);
        }
        libros.setAutor(autoresServices.findById(libros.getAutor().getId()).orElse(null));
        Libros libroGuardado = librosServices.save(libros);
        return new ResponseEntity<>(libroGuardado, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Libros> update(@PathVariable int id, @RequestBody Libros libros){
        Optional<Libros> libroExis = librosServices.findById(id);
        if (libroExis.isPresent()){
            Libros libroActualizado = libroExis.get();
            libroActualizado.setTitulo(libros.getTitulo());
            libroActualizado.setEditoral(libros.getEditoral());
            libroActualizado.setGenero(libros.getGenero());
            libroActualizado.setPrecio(libros.getPrecio());
            libroActualizado.setFechaPublicacion(libros.getFechaPublicacion());
            libroActualizado.setAutor(autoresServices.findById(libros.getAutor().getId()).orElse(null));
            return new ResponseEntity<>(librosServices.update(id, libroActualizado), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id){
        try{
            librosServices.delete(id);
            return ResponseEntity.noContent().build();
        }catch (EntityNotFoundException e){
            return ResponseEntity.notFound().build();
        }
    }
}
