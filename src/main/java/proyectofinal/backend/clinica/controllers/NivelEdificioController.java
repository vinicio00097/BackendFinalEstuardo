package proyectofinal.backend.clinica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyectofinal.backend.clinica.implementedServices.NivelesEdificio;
import proyectofinal.backend.clinica.utils.JsonResponse;

import java.util.List;

@RestController
@RequestMapping("NivelesEdificio")
public class NivelEdificioController {
    @Autowired
    private NivelesEdificio nivelesEdificio;

    @GetMapping("")
    public ResponseEntity<Object> index(){
        List<Object> response=nivelesEdificio.getAll();

        if(((int) response.get(0))==1){
            return new ResponseEntity<>(new JsonResponse(
                    "success",
                    31,
                    response.get(1),
                    "Niveles de edificio recuperados correctamente."
            ),HttpStatus.OK);
        }else{
            return new ResponseEntity<>(new JsonResponse(
                    "fail",
                    30,
                    null,
                    "Ha ocurrido un error al recuperar los niveles de edificio."
            ),HttpStatus.OK);
        }
    }
}
