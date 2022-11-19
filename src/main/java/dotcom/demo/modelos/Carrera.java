
package dotcom.demo.modelos;


import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

public class Carrera {
 
    private long idCarrera;
    private String nombre;

    @OneToMany(mappedBy="idUsuario", fetch= FetchType.EAGER)
    Set<Materia> materias = new HashSet<>();


    public Carrera() {
    }


    public Carrera( String nombre) {
        this.nombre = nombre;
    }

    public long d() {
        return idCarrera;
    }

    public void setIdCarrera(Usuario usuario) {
        this.idCarrera = idCarrera;
    }

    public void setIdCarrera1(Universidad universidad) {
        this.idCarrera = idCarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getIdCarrera() {
        return idCarrera;
    }

    public Set<Materia> getMaterias() {
        return materias;
    }

    public void addMateria(Materia materia) {
        materia.setIdMateria(this);
        materias.add(materia);
    }

}
