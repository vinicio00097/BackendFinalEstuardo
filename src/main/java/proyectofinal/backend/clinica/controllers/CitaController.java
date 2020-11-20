package proyectofinal.backend.clinica.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proyectofinal.backend.clinica.implementedServices.CitasPaciente;
import proyectofinal.backend.clinica.models.CitaPaciente;
import proyectofinal.backend.clinica.utils.JsonResponse;

import java.util.List;

@RestController
@RequestMapping("Pacientes/Citas")
public class CitaController {
    @Autowired
    CitasPaciente citasPaciente;

    @PostMapping("/Create")
    public ResponseEntity<Object> create(@RequestBody CitaPaciente citaPaciente){
        List<Object> response=citasPaciente.save(citaPaciente);

        if(((int) response.get(0))==1){
            return new ResponseEntity<>(new JsonResponse(
                    "success",
                    1,
                    response.get(1),
                    "Cita agregada correctamente."
            ),HttpStatus.OK);
        }else{
            return new ResponseEntity<>(new JsonResponse(
                    "fail",
                    0,
                    null,
                    "Ha ocurrido un error al agregar la cita."
            ),HttpStatus.OK);
        }
    }

    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable int id){
        List<Object> response=citasPaciente.delete(id);
        System.out.println(id);

        if(((int) response.get(0))==1){
            return new ResponseEntity<>(new JsonResponse(
             "success",
             1,
             null,
             "Cita eliminada correctamente."
            ),HttpStatus.OK);
        }else{
            return new ResponseEntity<>(new JsonResponse(
                    "fail",
                    0,
                    null,
                    "Ha ocurrido un error al eliminar la cita."
            ),HttpStatus.OK);
        }
    }

    @PutMapping("/Edit")
    public ResponseEntity<Object> update(@RequestBody CitaPaciente citaPaciente){
        List<Object> response=citasPaciente.update(citaPaciente);

        if(((int) response.get(0))==1){
            return new ResponseEntity<>(new JsonResponse(
                    "success",
                    1,
                    response.get(1),
                    "Cita modificada correctamente."
            ),HttpStatus.OK);
        }else{
            return new ResponseEntity<>(new JsonResponse(
                    "fail",
                    0,
                    null,
                    "Ha ocurrido un error al modificar la cita."
            ),HttpStatus.OK);
        }
    }
}
