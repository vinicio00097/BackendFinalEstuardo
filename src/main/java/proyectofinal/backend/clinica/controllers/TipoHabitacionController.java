package proyectofinal.backend.clinica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyectofinal.backend.clinica.implementedServices.TiposHabitacion;
import proyectofinal.backend.clinica.utils.JsonResponse;

import java.util.List;

@RestController
@RequestMapping("TiposHabitacion")
public class TipoHabitacionController {
    @Autowired
    private TiposHabitacion tiposHabitacion;

    @GetMapping("")
    public ResponseEntity<Object> index(){
        List<Object> response=tiposHabitacion.getAll();

        if(((int) response.get(0))==1){
            return new ResponseEntity<>(new JsonResponse(
                "success",
                    21,
                    response.get(1),
                    "Tipos de habitacion recuperados correctamente."
            ), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(new JsonResponse(
                    "fail",
                    20,
                    null,
                    "Ha ocurrido un error al recuperar los tipos de habitacion."
            ), HttpStatus.OK);
        }
    }
}
