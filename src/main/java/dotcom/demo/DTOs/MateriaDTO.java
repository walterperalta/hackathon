package dotcom.demo.DTOs;

import dotcom.demo.modelos.Materia;

public class MateriaDTO {

    private long id;
    private String nombre;

    public MateriaDTO() {
    }

    public MateriaDTO(Materia materia){
        this.id = materia.getId();
        this.nombre = materia.getNombre();
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
}
