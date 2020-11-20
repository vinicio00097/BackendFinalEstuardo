package proyectofinal.backend.clinica.implementedServices;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyectofinal.backend.clinica.dao.IDetalleRecetaDao;
import proyectofinal.backend.clinica.dao.IMedicinasDao;
import proyectofinal.backend.clinica.dao.IRecetaDao;
import proyectofinal.backend.clinica.models.Medicina;
import proyectofinal.backend.clinica.models.Receta;
import proyectofinal.backend.clinica.services.IMedicinas;
import proyectofinal.backend.clinica.services.IRecetas;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class Recetas implements IRecetas {
    @Autowired
    private IRecetaDao iRecetaDao;
    @Autowired
    private IDetalleRecetaDao detalleRecetaDao;
    @Autowired
    private IMedicinasDao iMedicinasDao;

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
        return null;
    }

    @Override
    public List<Object> update(Receta object) {
        return null;
    }

    @Override
    public List<Object> save(Receta object) {
        try {

            Receta finalObject=iRecetaDao.save(object);
            object.getDetallesRecetas().forEach(element->{
                if(element.getIdDetalleReceta()==0){
                    Optional<Medicina> optionalMedicina=iMedicinasDao.findById(element.getMedicina().getIdMedicina());

                    if(optionalMedicina.isPresent()&&optionalMedicina.get().getExistencia()>=element.getCantidad()){
                        optionalMedicina.get().setExistencia(optionalMedicina.get().getExistencia()-element.getCantidad());

                        element.setReceta(finalObject);
                        detalleRecetaDao.save(element);

                        iMedicinasDao.save(optionalMedicina.get());
                    }
                }
            });

            return Arrays.asList(1,finalObject);
        }catch (Exception e){
            e.printStackTrace();
            return Collections.singletonList(0);
        }
    }
}
