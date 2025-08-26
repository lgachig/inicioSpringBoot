package uce.edu.ec.iniciospringboot.DTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import uce.edu.ec.iniciospringboot.Model.Libros;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class LitbroDTO {

    private Integer id;
    private String titulo;
    private String editoral;
    private String genero;
    private BigDecimal precio;
    private LocalDate fechaPublicacion;
    private AutorDTO autorDTO;

    public LitbroDTO(Libros libros) {
        this.id = libros.getId();
        this.titulo = libros.getTitulo();
        this.editoral = libros.getEditoral();
        this.genero = libros.getGenero();
        this.precio = libros.getPrecio();
        this.fechaPublicacion = libros.getFechaPublicacion();
        this.autorDTO = new AutorDTO(libros.getAutor());
    }
}
