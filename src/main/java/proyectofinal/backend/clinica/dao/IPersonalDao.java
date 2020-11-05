package proyectofinal.backend.clinica.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import proyectofinal.backend.clinica.models.Personal;

public interface IPersonalDao extends JpaRepository<Personal,Integer> {
}
