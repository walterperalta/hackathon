package dotcom.demo.modelos;

public class Post {

    private long id;
    private String texto;
    // id usuario, id carrera


    public Post() {
    }

    public Post(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public long getId() {
        return id;
    }
}
