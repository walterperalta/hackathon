package dotcom.demo.repositorio;

import dotcom.demo.modelos.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarreraRepository extends JpaRepository<Carrera, Long> {
}
