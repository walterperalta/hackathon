package dotcom.demo.repositorio;

import dotcom.demo.modelos.Universidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnivesidadRepository extends JpaRepository <Universidad, Long> {

}
