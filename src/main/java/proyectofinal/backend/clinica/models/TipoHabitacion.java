package proyectofinal.backend.clinica.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity(name = "TipoHabitacion")
public class TipoHabitacion {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) int IdTipoHabitacion;

    @NotBlank
    private String Descripcion;

    @NotBlank
    private String Activo;
}
