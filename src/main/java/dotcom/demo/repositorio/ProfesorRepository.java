package dotcom.demo.repositorio;

import dotcom.demo.modelos.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository <Profesor, Long> {
}
