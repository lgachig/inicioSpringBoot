package uce.edu.ec.iniciospringboot.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uce.edu.ec.iniciospringboot.Model.Autor;
import uce.edu.ec.iniciospringboot.Services.AutoresServices;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/autores")
public class AutoresControllers {

    @Autowired
    private AutoresServices autoresServices;

    @GetMapping("")
    public List<Autor> getAutores(){
        return autoresServices.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Autor> getAutor(@PathVariable int id){
        return new ResponseEntity<>(autoresServices.findById(id).orElse(null), HttpStatus.OK);
    }

    @PostMapping("autor/save")
    public ResponseEntity<Autor> save(@RequestBody Autor autor){
        return new ResponseEntity<>(autoresServices.save(autor), HttpStatus.CREATED);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Autor> update(@PathVariable int id, @RequestBody Autor autor){
        Optional<Autor> autorExis = autoresServices.findById(id);
        if (autorExis.isPresent()){
            Autor autorActualizado = autorExis.get();
            autorActualizado.setNombre(autor.getNombre());
            autorActualizado.setApellido(autor.getApellido());
            autorActualizado.setTelefono(autor.getTelefono());
            return new ResponseEntity<>(autoresServices.update(id, autorActualizado), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id){
        try{
            autoresServices.delete(id);
            return ResponseEntity.noContent().build();
        }catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }


}
