package uce.edu.ec.iniciospringboot.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "personas")
public class Persona {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombres")
    private String nombre;
    @Column(name = "apellidos")
    private String apellido;
    @Column(name = "lenguajes")
    private String lenguaje;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String lenguaje) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.lenguaje = lenguaje;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", lenguajes='" + lenguaje + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
