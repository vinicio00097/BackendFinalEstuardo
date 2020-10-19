package proyectofinal.backend.clinica.implementedServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyectofinal.backend.clinica.dao.IHabitacionesDao;
import proyectofinal.backend.clinica.dao.IUbicacionDao;
import proyectofinal.backend.clinica.models.Ubicacion;
import proyectofinal.backend.clinica.services.IUbicaciones;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class Ubicaciones implements IUbicaciones {
    @Autowired
    private IUbicacionDao ubicacionDao;

    @Override
    public List<Object> getAll() {
        try {
            return Arrays.asList(1,ubicacionDao.findAll());
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
    public List<Object> update(Ubicacion object) {
        return null;
    }

    @Override
    public List<Object> save(Ubicacion object) {
        return null;
    }
}
