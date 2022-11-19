package dotcom.demo.servicios.Impl;

import dotcom.demo.DTOs.UsuarioDTO;
import dotcom.demo.excepciones.ResourceNotFoundException;
import dotcom.demo.mappers.UsuarioMappers;
import dotcom.demo.modelos.Usuario;
import dotcom.demo.repositorio.UsuarioRepository;
import dotcom.demo.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private UsuarioMappers usuarioMappers;

    @Autowired
    private ResourceNotFoundException exception;

    @Override
    public List<UsuarioDTO> getAllUsuarios() {
        List<Usuario> usuarios = repository.findAll();
        List<UsuarioDTO> response = usuarios.stream().map(usuario -> usuarioMappers.mapearUsuario(usuario)).collect(Collectors.toList());
        return response;
    }

    @Override
    public UsuarioDTO crearUsuario(UsuarioDTO usuarioDTO) {
        repository.save(usuarioMappers.mapearDTO(usuarioDTO));
        return usuarioDTO;
    }

    @Override
    public UsuarioDTO editarUsuario(long id) {
        Usuario usuario = repository.findById(id).orElseThrow
                (()-> new ResourceNotFoundException("Usuario","id",id));
        return usuarioMappers.mapearUsuario(usuario);
    }

    @Override
    public void eliminarUsuario(long id) {
        repository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Usuario","id",id));
    }
}
