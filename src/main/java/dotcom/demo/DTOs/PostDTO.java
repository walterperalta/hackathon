package dotcom.demo.DTOs;

import dotcom.demo.modelos.Post;

public class PostDTO {
    private long id;
    private String texto;

    public PostDTO() {
    }

    public PostDTO(Post post){
        this.id = post.getId();
        this.texto = post.getTexto();;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }


}
