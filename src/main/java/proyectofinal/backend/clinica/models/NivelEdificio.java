package proyectofinal.backend.clinica.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "NivelEdificio")
public class NivelEdificio {
    private @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int  IdNivelEdificio;

    @NotBlank
    private String Descripcion;

    @OneToMany(mappedBy = "NivelEdificio")
    private List<Habitacion> habitaciones=new ArrayList<>();

    public int getIdNivelEdificio() {
        return IdNivelEdificio;
    }

    public void setIdNivelEdificio(int idNivelEdificio) {
        IdNivelEdificio = idNivelEdificio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
}
