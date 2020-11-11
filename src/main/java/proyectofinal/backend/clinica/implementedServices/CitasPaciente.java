package proyectofinal.backend.clinica.implementedServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyectofinal.backend.clinica.dao.ICitasDao;
import proyectofinal.backend.clinica.models.CitaPaciente;
import proyectofinal.backend.clinica.services.ICitas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class CitasPaciente implements ICitas {
    @Autowired
    private ICitasDao citasDao;

    @Override
    public List<Object> getAll() {
        return null;
    }

    @Override
    public Optional<Object> get(int id) {
        return Optional.empty();
    }

    @Override
    public List<Object> delete(int id) {
        try {
            citasDao.deleteById(id);

            return Collections.singletonList(1);
        }catch (Exception e){
            e.printStackTrace();
            return Collections.singletonList(0);
        }
    }

    @Override
    public List<Object> update(CitaPaciente object) {
        try{
            return Arrays.asList(1,citasDao.save(object));
        }catch (Exception e){
            e.printStackTrace();
            return Collections.singletonList(0);
        }
    }

    @Override
    public List<Object> save(CitaPaciente object) {
        try{
            return Arrays.asList(1,citasDao.save(object));
        }catch (Exception e){
            e.printStackTrace();
            return Collections.singletonList(0);
        }
    }
}
