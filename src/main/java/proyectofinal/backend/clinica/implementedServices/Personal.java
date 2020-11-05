package proyectofinal.backend.clinica.implementedServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyectofinal.backend.clinica.dao.IPersonalDao;
import proyectofinal.backend.clinica.services.IPersonal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class Personal implements IPersonal {
    @Autowired
    private IPersonalDao personalDao;

    @Override
    public List<Object> getAll() {
        try {
            return Arrays.asList(1,personalDao.findAll());
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
    public List<Object> update(proyectofinal.backend.clinica.models.Personal object) {
        return null;
    }

    @Override
    public List<Object> save(proyectofinal.backend.clinica.models.Personal object) {
        return null;
    }
}
