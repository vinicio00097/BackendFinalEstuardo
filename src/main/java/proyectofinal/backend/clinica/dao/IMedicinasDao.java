package proyectofinal.backend.clinica.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import proyectofinal.backend.clinica.models.Medicina;

public interface IMedicinasDao extends JpaRepository<Medicina,Integer> {
}
