package proyectofinal.backend.clinica.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyectofinal.backend.clinica.utils.JsonResponse;

@RestController
@RequestMapping("Habitaciones")
public class HabitacionController{

    @GetMapping("")
    public ResponseEntity<Object> index(){
        return new ResponseEntity<>(new JsonResponse("success",
                1,
                null,
                "Controlador alcanzado correctamente."),
                HttpStatus.OK);
    }
}
