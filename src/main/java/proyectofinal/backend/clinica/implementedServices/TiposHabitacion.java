package proyectofinal.backend.clinica.implementedServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyectofinal.backend.clinica.dao.ITipoHabitacionDao;
import proyectofinal.backend.clinica.models.TipoHabitacion;
import proyectofinal.backend.clinica.services.ITiposHabitacion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class TiposHabitacion implements ITiposHabitacion {
    @Autowired
    private ITipoHabitacionDao tipoHabitacionDao;

    @Override
    public List<Object> getAll() {
        try {
            return Arrays.asList(1,tipoHabitacionDao.findAll());
        }catch (Exception e){
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
    public List<Object> update(TipoHabitacion object) {
        return null;
    }

    @Override
    public List<Object> save(TipoHabitacion object) {
        return null;
    }
}
