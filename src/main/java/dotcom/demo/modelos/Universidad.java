package dotcom.demo.modelos;

public class Universidad {

    private long id;
    private String nombre;
    //carreras


    public Universidad() {
    }

    public Universidad(String nombre) {
        this.nombre = nombre;
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
