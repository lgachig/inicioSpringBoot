package uce.edu.ec.iniciospringboot.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import uce.edu.ec.iniciospringboot.Model.Autor;

@Data
@NoArgsConstructor
public class AutorDTO {

    public int id;
    public String nombre;
    public String apellido;
    public String telefono;

    public AutorDTO(Autor autor) {
        this.telefono = autor.getTelefono();
        this.apellido = autor.getApellido();
        this.nombre = autor.getNombre();
        this.id = autor.getId();
    }
}
