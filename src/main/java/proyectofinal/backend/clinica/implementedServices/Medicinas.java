package proyectofinal.backend.clinica.implementedServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyectofinal.backend.clinica.dao.IMedicinasDao;
import proyectofinal.backend.clinica.models.Medicina;
import proyectofinal.backend.clinica.services.IMedicinas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class Medicinas implements IMedicinas {
    @Autowired
    private IMedicinasDao medicinasDao;

    @Override
    public List<Object> getAll() {
        try {
            return Arrays.asList(1,medicinasDao.findAll());
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
    public List<Object> update(Medicina object) {
        return null;
    }

    @Override
    public List<Object> save(Medicina object) {
        return null;
    }
}
