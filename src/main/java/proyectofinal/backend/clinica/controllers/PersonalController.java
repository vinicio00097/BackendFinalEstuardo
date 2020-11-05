package proyectofinal.backend.clinica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyectofinal.backend.clinica.implementedServices.Personal;
import proyectofinal.backend.clinica.utils.JsonResponse;

import java.util.List;

@RestController
@RequestMapping("Personal")
public class PersonalController {
    @Autowired
    private Personal personal;

    @GetMapping("")
    public ResponseEntity<Object> index(){
        List<Object> response=personal.getAll();

        if(((int) response.get(0))==1){
            return new ResponseEntity<>(new JsonResponse(
                    "success",
                    51,
                    response.get(1),
                    "Personal recuperado correctamente."
            ),HttpStatus.OK);
        }else{
            return new ResponseEntity<>(new JsonResponse(
                    "fail",
                    50,
                    null,
                    "Ha ocurrido un error al recuperar el personal."
            ),HttpStatus.OK);
        }
    }
}
