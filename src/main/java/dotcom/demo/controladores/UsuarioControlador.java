package dotcom.demo.controladores;

import dotcom.demo.DTOs.UsuarioDTO;
import dotcom.demo.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioControlador {

    @Autowired
    private PasswordEncoder password;

    @Autowired
    private UsuarioServicio servicio;

    @GetMapping("/usuarios")
    public List<UsuarioDTO> getUsuarios(){
        return servicio.getAllUsuarios();
    }

    @PostMapping("/usuarios")
    public UsuarioDTO crearUsuario(UsuarioDTO usuarioDTO){
        return servicio.crearUsuario(usuarioDTO);
    }

    @PutMapping("/usuarios")
    public UsuarioDTO editarUsuario(long id){
        return servicio.editarUsuario(id);
    }

    @DeleteMapping("/usuarios")
    public String eliminarUsuario(long id){
        servicio.eliminarUsuario(id);
        return "Usuario eliminado exitosamente";
    }

}
