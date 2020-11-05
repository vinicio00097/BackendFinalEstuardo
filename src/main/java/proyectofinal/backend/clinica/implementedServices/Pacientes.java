package proyectofinal.backend.clinica.implementedServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyectofinal.backend.clinica.dao.IPacientesDao;
import proyectofinal.backend.clinica.models.Paciente;
import proyectofinal.backend.clinica.services.IPacientes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class Pacientes implements IPacientes {
    @Autowired
    private IPacientesDao pacientesDao;

    @Override
    public List<Object> getAll() {
        try {
            return Arrays.asList(1,pacientesDao.findAll());
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
        try{
            pacientesDao.deleteById(id);

            return Collections.singletonList(1);
        }catch (Exception e){
            e.printStackTrace();

            return Collections.singletonList(0);
        }
    }

    @Override
    public List<Object> update(Paciente object) {
        try{
            return Arrays.asList(1,pacientesDao.save(object));
        }catch (Exception e){
            return Collections.singletonList(0);
        }
    }

    @Override
    public List<Object> save(Paciente object) {
        try {
            return Arrays.asList(1,pacientesDao.save(object));
        }catch (Exception e){
            e.printStackTrace();

            return Collections.singletonList(0);
        }
    }
}
