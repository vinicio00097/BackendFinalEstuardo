package proyectofinal.backend.clinica.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proyectofinal.backend.clinica.implementedServices.Habitaciones;
import proyectofinal.backend.clinica.models.Habitacion;
import proyectofinal.backend.clinica.utils.JsonResponse;

import java.util.List;

@RestController
@RequestMapping("Habitaciones")
public class HabitacionController{
    @Autowired
    private Habitaciones habitaciones;

    @GetMapping("")
    public ResponseEntity<Object> index(){
        List<Object> response=habitaciones.getAll();

        if(((int ) response.get(0))==1){
            return new ResponseEntity<>(new JsonResponse("success",
                    1,
                    response.get(1),
                    "Habitaciones recuperadas correctamente."),
                    HttpStatus.OK);
        }else{
            return new ResponseEntity<>(new JsonResponse("fail",
                    0,
                    null,
                    "Ha ocurrido un error al obtener las habitaciones."),
                    HttpStatus.OK);
        }
    }

    @PutMapping("/Edit")
    public ResponseEntity<Object> edit(@RequestBody Habitacion habitacion){
        List<Object> response=habitaciones.update(habitacion);

        if(((int ) response.get(0))==1){
            return new ResponseEntity<>(new JsonResponse("success",
                    1,
                    response.get(1),
                    "Habitacion actuailizada."),
                    HttpStatus.OK);
        }else{
            return new ResponseEntity<>(new JsonResponse("fail",
                    0,
                    null,
                    "Ha ocurrido un error al actualizar habitacion."),
                    HttpStatus.OK);
        }
    }
}
