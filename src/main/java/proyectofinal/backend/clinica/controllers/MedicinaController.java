package proyectofinal.backend.clinica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyectofinal.backend.clinica.implementedServices.Medicinas;
import proyectofinal.backend.clinica.utils.JsonResponse;

import java.util.List;

@RestController
@RequestMapping("Medicinas")
public class MedicinaController {
    @Autowired
    private Medicinas medicinas;

    @GetMapping("")
    public ResponseEntity<Object> index(){
        List<Object> response=medicinas.getAll();

        if(((int) response.get(0))==1){
            return new ResponseEntity<>(new JsonResponse(
                    "success",
                    1,
                    response.get(1),
                    "Medicinas obtenidas correctamente."
            ),HttpStatus.OK);
        }else{
            return new ResponseEntity<>(new JsonResponse(
                    "success",
                    1,
                    null,
                    "Ha ocurrido un error y no se obtuvieron las medicinas."
            ),HttpStatus.OK);
        }
    }
}
