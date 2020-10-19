package proyectofinal.backend.clinica.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import proyectofinal.backend.clinica.models.Habitacion;

public interface IHabitacionesDao extends JpaRepository<Habitacion,Integer> {
}
