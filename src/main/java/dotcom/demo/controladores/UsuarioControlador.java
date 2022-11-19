package dotcom.demo.controladores;

import dotcom.demo.DTOs.UsuarioDTO;
import dotcom.demo.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class UsuarioControlador {

    @Autowired
    private PasswordEncoder password;


    @GetMapping("/usuarios")
    public List<UsuarioDTO> getUsuarios(){
        return UsuarioRepository.findAll().stream().map(usuario -> new UsuarioDTO ()).collect(Collectors.toList());

    }

}
