package proyectofinal.backend.clinica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyectofinal.backend.clinica.implementedServices.Ubicaciones;
import proyectofinal.backend.clinica.utils.JsonResponse;

import java.util.List;

@RestController
@RequestMapping("Ubicaciones")
public class UbicacionController {
    @Autowired
    private Ubicaciones ubicaciones;

    @GetMapping("")
    public ResponseEntity<Object> index(){
        List<Object> response=ubicaciones.getAll();

        if(((int) response.get(0))==1){
            return new ResponseEntity<>(new JsonResponse(
                    "success",
                    11,
                    response.get(1),
                    "Ubicaciones recuperadas correctamente."
            ), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(new JsonResponse(
                    "fail",
                    10,
                    null,
                    "Ha ocurrido un error al recuperar las ubicaciones."
            ), HttpStatus.OK);
        }
    }
}
