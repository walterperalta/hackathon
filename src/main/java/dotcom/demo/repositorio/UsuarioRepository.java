package dotcom.demo.repositorio;

import dotcom.demo.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UsuarioRepository extends JpaRepository <Usuario, Long>{
    Usuario findByUsername(String username);

}
