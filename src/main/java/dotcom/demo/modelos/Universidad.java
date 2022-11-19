package dotcom.demo.modelos;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

public class Universidad {

    private long idUniversidad;
    private String nombre;

    @OneToMany(mappedBy="idUniversidad", fetch= FetchType.EAGER)
    Set<Carrera> carreras = new HashSet<>();


    public Universidad() {
    }

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public long getIdUniversidad() {
        return idUniversidad;
    }

    public void setIdUniversidad(Usuario usuario) {
        this.idUniversidad = idUniversidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Carrera> getCarreras() {
        return carreras;
    }

    public void addCarrera(Carrera carrera) {
        carrera.setIdCarrera1(this);
        carreras.add(carrera);
    }

}
