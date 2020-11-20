package proyectofinal.backend.clinica.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import proyectofinal.backend.clinica.models.Receta;

public interface IRecetaDao extends JpaRepository<Receta,Integer> {
    
}
