package proyectofinal.backend.clinica.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import proyectofinal.backend.clinica.models.TipoHabitacion;

public interface ITipoHabitacionDao extends JpaRepository<TipoHabitacion,Integer> {
}
