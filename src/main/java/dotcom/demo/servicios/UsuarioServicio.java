package dotcom.demo.servicios;

import dotcom.demo.DTOs.UsuarioDTO;
import dotcom.demo.modelos.Usuario;

import java.util.List;

public interface UsuarioServicio {

    List<UsuarioDTO> getAllUsuarios();

    UsuarioDTO crearUsuario(UsuarioDTO usuarioDTO);

    UsuarioDTO editarUsuario(long id);

    void eliminarUsuario(long id);
}
