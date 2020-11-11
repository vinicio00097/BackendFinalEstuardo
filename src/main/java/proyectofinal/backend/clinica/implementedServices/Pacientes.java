package proyectofinal.backend.clinica.implementedServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyectofinal.backend.clinica.dao.IHabitacionesDao;
import proyectofinal.backend.clinica.dao.IPacientesDao;
import proyectofinal.backend.clinica.models.Habitacion;
import proyectofinal.backend.clinica.models.Paciente;
import proyectofinal.backend.clinica.services.IPacientes;

import java.sql.SQLOutput;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.*;

@Service
public class Pacientes implements IPacientes {
    @Autowired
    private IPacientesDao pacientesDao;

    @Autowired
    private IHabitacionesDao habitacionesDao;

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
            System.out.println("puto");
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
            object.getInternados().forEach(hola->{
                hola.setPaciente(object);

                if(hola.getFechaSalida()==null){
                    Habitacion habitacion=hola.getHabitacion();
                    habitacion.setHabitacionDisponible(false);

                    habitacionesDao.save(habitacion);
                }
            });

            return Arrays.asList(1,pacientesDao.save(object));
        }catch (Exception e){
            e.printStackTrace();

            return Collections.singletonList(0);
        }
    }

    @Override
    public List<Object> updateInternados(Paciente object) {
        try{
            object.getInternados().forEach(hola->{
                hola.setPaciente(object);

                if(hola.getFechaSalida()==null){
                    hola.setFechaSalida(new Timestamp(new Date().getTime()).toString());

                    Habitacion habitacion=hola.getHabitacion();
                    habitacion.setHabitacionDisponible(true);

                    habitacionesDao.save(habitacion);
                }
            });

            return Arrays.asList(1,pacientesDao.save(object));
        }catch (Exception e){
            return Collections.singletonList(0);
        }
    }
}
