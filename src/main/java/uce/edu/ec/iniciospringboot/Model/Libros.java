package uce.edu.ec.iniciospringboot.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Libros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titulo;
    private String editoral;
    private String genero;
    private BigDecimal precio;
    private LocalDate fechaPublicacion;

    @ManyToOne
    private Autor autor;


}