package proyectofinal.backend.clinica;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import proyectofinal.backend.clinica.dao.IUbicacionDao;
import proyectofinal.backend.clinica.models.Ubicacion;

import java.util.Optional;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UnitTest {
    @Autowired
    private IUbicacionDao ubicacionDao;

    @Test
    public void test1(){
        Ubicacion ubicacion=new Ubicacion();
        ubicacion.setDescripcion("ubicacion 1");

        ubicacionDao.save(ubicacion);

        Optional<Ubicacion> found=ubicacionDao.findById(ubicacion.getIdUbicacion());

        assert found.isPresent() && found.get().getDescripcion().equals(ubicacion.getDescripcion());
    }
}
