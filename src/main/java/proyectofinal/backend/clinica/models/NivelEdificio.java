package proyectofinal.backend.clinica.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity(name = "NivelEdificio")
public class NivelEdificio {
    private @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int  IdNivelEdificio;

    @NotBlank
    private String Descripcion;
}
