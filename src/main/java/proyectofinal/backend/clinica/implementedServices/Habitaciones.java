package proyectofinal.backend.clinica.implementedServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyectofinal.backend.clinica.dao.IHabitacionesDao;
import proyectofinal.backend.clinica.models.Habitacion;
import proyectofinal.backend.clinica.services.IHabitaciones;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class Habitaciones implements IHabitaciones {
    @Autowired
    private IHabitacionesDao habitacionesDao;

    @Override
    public List<Object> getAll() {
        try{
            return Arrays.asList(1,habitacionesDao.findAll());
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
    public List<Object> update(Habitacion object) {
        return null;
    }

    @Override
    public List<Object> save(Habitacion object) {
        return null;
    }
}
