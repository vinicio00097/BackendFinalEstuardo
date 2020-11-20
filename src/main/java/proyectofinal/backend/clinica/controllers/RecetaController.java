package proyectofinal.backend.clinica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proyectofinal.backend.clinica.implementedServices.Recetas;
import proyectofinal.backend.clinica.models.DetallesReceta;
import proyectofinal.backend.clinica.utils.JsonResponse;

import java.util.List;

@RestController
@RequestMapping("Recetas")
public class RecetaController {
    @Autowired
    private Recetas recetas;

    @PostMapping("/Create")
    public ResponseEntity<Object> create(@RequestBody proyectofinal.backend.clinica.models.Receta receta){
        List<Object> response=recetas.save(receta);

        if(((int)response.get(0))==1){
            return new ResponseEntity<>(new JsonResponse(
             "success",
             1,
             response.get(1),
             "Receta guardada."
            ),HttpStatus.OK);   
        }else{
            return new ResponseEntity<>(new JsonResponse(
                    "success",
                    1,
                    response.get(1),
                    "Error al guardar receta."
            ),HttpStatus.OK);
        }
    }
}
