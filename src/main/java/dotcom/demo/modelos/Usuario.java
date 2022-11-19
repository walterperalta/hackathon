package dotcom.demo.modelos;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long idUsuario;
    private String nombre;
    private String apellido;
    private String username;
    private String correo;
    private String password;

    @OneToMany(mappedBy="idUsuario", fetch= FetchType.EAGER)
    Set<Carrera> carreras = new HashSet<>();

    @OneToMany(mappedBy="idUsuario", fetch= FetchType.EAGER)
    Set<Universidad> universidades = new HashSet<>();



    public Usuario() {
    }


    public Usuario(String nombre, String apellido, String username, String correo, String password, String carrera, String universidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.correo = correo;
        this.password = password;
    }


    public void setIdUsuario(int idUsuario) {
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

    public long getIdUsuario() {
        return idUsuario;
    }

    public Set<Carrera> getCarreras() {
        return carreras;
    }

    public void addCarrera(Carrera carrera) {
        carrera.setIdCarrera(this);
        carreras.add(carrera);
    }


    public Set<Universidad> getUniversidades() {
        return universidades;
    }

    public void addUnivesidades(Universidad universidad) {
        universidad.setIdUniversidad(this);
        universidades.add(universidad);
    }


    public void regirstrarse(){
        System.out.println("El ususario"+ nombre +"se registro");
    }
    public void publicar(){
        System.out.println("El ususario"+ nombre +"publico algo");
    }
    public void login(){
        System.out.println("El ususario"+ nombre +"incio cesion");
    }
    public void puntuar(){
        System.out.println("El ususario"+ nombre +"puntuo");
    }


}

