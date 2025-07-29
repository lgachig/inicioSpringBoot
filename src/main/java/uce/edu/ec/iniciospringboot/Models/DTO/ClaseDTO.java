package uce.edu.ec.iniciospringboot.Models.DTO;

// la claseDto sirve para enviar datos entre el cliente y el servidor
// ayudando a evitar el problema de seguridad, porque no se puede enviar datos sin ser validados
public class ClaseDTO {
    private String titulo, usuario;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
