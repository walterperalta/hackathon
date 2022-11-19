package dotcom.demo.DTOs;

import dotcom.demo.modelos.Usuario;

public class UsuarioDTO {

    private long idUsuario;
    private String nombre;
    private String apellido;
    private String username;
    private String correo;
    private String password;
   // private String carrera;
   // private String universidad;

    public UsuarioDTO() { };

    public UsuarioDTO(Usuario usuario){
        this.idUsuario = usuario.getIdUsuario();
        this.apellido = usuario.getApellido();
        this.nombre = usuario.getNombre();
        this.username = usuario.getUsername();
        this.correo = usuario.getCorreo();
        this.password = usuario.getPassword();
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
