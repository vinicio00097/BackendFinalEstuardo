package proyectofinal.backend.clinica.implementedServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyectofinal.backend.clinica.dao.INivelesEdificioDao;
import proyectofinal.backend.clinica.dao.ITipoHabitacionDao;
import proyectofinal.backend.clinica.models.NivelEdificio;
import proyectofinal.backend.clinica.services.INivelesEdificio;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class NivelesEdificio implements INivelesEdificio {
    @Autowired
    private INivelesEdificioDao nivelesEdificioDao;

    @Override
    public List<Object> getAll() {
        try {
            return Arrays.asList(1,nivelesEdificioDao.findAll());
        }catch (Exception e){
            e.printStackTrace();

            return Collections.singletonList(0);
        }
    }

    @Override
    public Optional<Object> get(int id) {
        return Optional.empty();
    }

    @Override
    public List<Object> delete(int id) {
        return null;
    }

    @Override
    public List<Object> update(NivelEdificio object) {
        return null;
    }

    @Override
    public List<Object> save(NivelEdificio object) {
        return null;
    }
}
