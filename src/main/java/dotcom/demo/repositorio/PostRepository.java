package dotcom.demo.repositorio;

import dotcom.demo.modelos.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PostRepository extends JpaRepository <Post, Long> {
}
