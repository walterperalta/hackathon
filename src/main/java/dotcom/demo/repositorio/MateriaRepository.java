package dotcom.demo.repositorio;

import dotcom.demo.modelos.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MateriaRepository extends JpaRepository<Materia, Long> {
}
