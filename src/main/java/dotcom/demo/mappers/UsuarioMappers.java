package dotcom.demo.mappers;

import dotcom.demo.DTOs.UsuarioDTO;
import dotcom.demo.modelos.Usuario;

public class UsuarioMappers {

    public Usuario mapearDTO(UsuarioDTO usuarioDTO){
        Usuario usuario = new Usuario();
        usuario.setNombre(usuarioDTO.getNombre());
        usuario.setApellido(usuarioDTO.getApellido());
        usuario.setCorreo(usuarioDTO.getCorreo());
        usuario.setUsername(usuarioDTO.getUsername());
        return usuario;
    }

    public UsuarioDTO mapearUsuario(Usuario usuario){
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setNombre(usuario.getNombre());
        usuarioDTO.setApellido(usuario.getApellido());
        usuarioDTO.setCorreo(usuario.getCorreo());
        usuarioDTO.setUsername(usuario.getUsername());
        return usuarioDTO;
    }

}
