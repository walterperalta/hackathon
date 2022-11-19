package dotcom.demo.DTOs;

import dotcom.demo.modelos.Profesor;

import java.util.List;

public class ProfesorDTO {
    private long id;
    private String nombre;
    private String apellido;
    private List<String> comentarios;

    public ProfesorDTO() {
    }

    public ProfesorDTO(Profesor profesor){
        this.id = profesor.getId();
        this.nombre = profesor.getNombre();
        this.apellido = profesor.getApellido();
        this.comentarios = profesor.getComentarios();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public List<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<String> comentarios) {
        this.comentarios = comentarios;
    }

}
