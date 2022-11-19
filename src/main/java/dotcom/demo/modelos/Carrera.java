
package dotcom.demo.modelos;


import javax.persistence.Column;
import javax.persistence.ElementCollection;
import java.util.ArrayList;
import java.util.List;

public class Carrera {
 
private long id;
private String nombre;

    //@ElementCollection
    //@Column(name = "payment")
    //private List<Integer> payments = new ArrayList<>();



    public Carrera() {
    }


    public Carrera( String nombre) {
        this.nombre = nombre;
    }

    public long d() {
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

    public long getId() {
        return id;
    }
}
