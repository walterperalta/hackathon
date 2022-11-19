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
}
