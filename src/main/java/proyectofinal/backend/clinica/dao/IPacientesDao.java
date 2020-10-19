package proyectofinal.backend.clinica.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import proyectofinal.backend.clinica.models.Paciente;

public interface IPacientesDao extends JpaRepository<Paciente,Integer> {
}
