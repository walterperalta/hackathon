package dotcom.demo.modelos;

import java.util.List;


public class Profesor {

private long id;    
private String nombre;
private String apellido;
private List <String> comentarios;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, List<String> comentarios) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.comentarios = comentarios;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
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
