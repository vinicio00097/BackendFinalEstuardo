package proyectofinal.backend.clinica.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import proyectofinal.backend.clinica.models.Ubicacion;

public interface IUbicacionDao extends JpaRepository<Ubicacion,Integer> {
}
