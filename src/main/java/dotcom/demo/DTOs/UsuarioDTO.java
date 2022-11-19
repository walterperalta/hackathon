package dotcom.demo.DTOs;

import dotcom.demo.modelos.Carrera;
import dotcom.demo.modelos.Universidad;
import dotcom.demo.modelos.Usuario;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class UsuarioDTO {

    private long idUsuario;
    private String nombre;
    private String apellido;
    private String username;
    private String correo;
    private String password;
    private Set<CarreraDTO> carreras = new HashSet<>();
    private Set<UniversidadDTO> universidades = new HashSet<>();

    public UsuarioDTO() { };

    public UsuarioDTO(Usuario usuario){
        this.idUsuario = usuario.getIdUsuario();
        this.apellido = usuario.getApellido();
        this.nombre = usuario.getNombre();
        this.username = usuario.getUsername();
        this.correo = usuario.getCorreo();
        this.password = usuario.getPassword();
        this.carreras = usuario.getCarreras().stream().map(carrera -> new CarreraDTO(carrera)).collect(Collectors.toSet());
        this.universidades = usuario.getUniversidades().stream().map(universidad -> new UniversidadDTO(universidad)).collect(Collectors.toSet());
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
