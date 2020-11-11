package proyectofinal.backend.clinica.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proyectofinal.backend.clinica.implementedServices.Pacientes;
import proyectofinal.backend.clinica.models.Paciente;
import proyectofinal.backend.clinica.utils.JsonResponse;

import javax.websocket.server.PathParam;
import java.sql.SQLOutput;
import java.util.List;

@RestController
@RequestMapping("Pacientes")
public class PacienteController {
    @Autowired
    private Pacientes pacientes;

    @GetMapping("")
    public ResponseEntity<Object> index(){
        List<Object> response=pacientes.getAll();

        if(((int) response.get(0))==1){
            return new ResponseEntity<>(new JsonResponse(
                    "success",
                    41,
                    response.get(1),
                    "Pacientes recuperados correctamente."
            ), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(new JsonResponse(
                    "fail",
                    40,
                    null,
                    "Ha ocurrido un error al recuperar los pacientes."
            ), HttpStatus.OK);
        }
    }

    @PostMapping("/Create")
    public ResponseEntity<Object> create(@RequestBody Paciente paciente){
        List<Object> response=pacientes.save(paciente);

        if(((int) response.get(0))==1){
            return new ResponseEntity<>(new JsonResponse(
                    "success",
                    42,
                    response.get(1),
                    "Paciente agregado correctamente."
            ), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(new JsonResponse(
                    "fail",
                    40,
                    null,
                    "Ha ocurrido un error al guardar al paciente."
            ), HttpStatus.OK);
        }
    }

    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable int id){
        List<Object> response=pacientes.delete(id);

        if(((int) response.get(0))==1){
            return new ResponseEntity<>(new JsonResponse(
                    "success",
                    43,
                    null,
                    "Paciente eliminado correctamente."
            ), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(new JsonResponse(
                    "fail",
                    40,
                    null,
                    "Ha ocurrido un error al eliminar el paciente."
            ), HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/Update")
    public ResponseEntity<Object> update(@RequestBody Paciente paciente){
        List<Object> response=pacientes.update(paciente);

        if(((int) response.get(0))==1){
            return new ResponseEntity<>(new JsonResponse(
                    "success",
                    44,
                    response.get(1),
                    "Paciente modificado correctamente."
            ), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(new JsonResponse(
                    "fail",
                    40,
                    null,
                    "Ha ocurrido un error al modificar al paciente."
            ), HttpStatus.OK);
        }
    }

    @PutMapping("/Internados/Update")
    public ResponseEntity<Object> updateInternados(@RequestBody Paciente paciente) throws JsonProcessingException {
        List<Object> response=pacientes.updateInternados(paciente);

        System.out.println(new ObjectMapper().writeValueAsString(paciente));

        if(((int) response.get(0))==1){
            return new ResponseEntity<>(new JsonResponse(
                    "success",
                    44,
                    response.get(1),
                    "Paciente modificado correctamente."
            ), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(new JsonResponse(
                    "fail",
                    40,
                    null,
                    "Ha ocurrido un error al modificar al paciente."
            ), HttpStatus.OK);
        }
    }
}
