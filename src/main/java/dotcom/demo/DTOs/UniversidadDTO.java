package dotcom.demo.DTOs;

import dotcom.demo.modelos.Universidad;

public class UniversidadDTO {
    private long id;
    private String nombre;

    public UniversidadDTO() {
    }

    public UniversidadDTO(Universidad universidad){
        this.id = universidad.getIdUniversidad();
        this.nombre = universidad.getNombre();
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
