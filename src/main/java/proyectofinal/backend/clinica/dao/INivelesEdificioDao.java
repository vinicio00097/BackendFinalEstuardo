package proyectofinal.backend.clinica.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import proyectofinal.backend.clinica.models.NivelEdificio;

public interface INivelesEdificioDao extends JpaRepository<NivelEdificio,Integer> {
}
