package proyectofinal.backend.clinica.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import proyectofinal.backend.clinica.models.DetallesReceta;

public interface IDetalleRecetaDao extends JpaRepository<DetallesReceta,Integer> {
}
