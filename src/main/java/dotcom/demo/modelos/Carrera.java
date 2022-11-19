
package dotcom.demo.modelos;


public class Carrera {
 
private long idCarrera;
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
        return idCarrera;
    }

    public void setIdCarrera(Universidad universidad) {
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
}
