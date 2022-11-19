package dotcom.demo.DTOs;

import dotcom.demo.modelos.Carrera;

public class CarreraDTO {

    private long id;
    private String nombre;

    public CarreraDTO() {
    }

    public CarreraDTO(Carrera carrera){
        this.id = carrera.getId();
        this.nombre = carrera.getNombre();
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
