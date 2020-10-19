package proyectofinal.backend.clinica.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "TipoHabitacion")
public class TipoHabitacion {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) int IdTipoHabitacion;

    @NotBlank
    private String Descripcion;

    @NotBlank
    private String Activo;

    @OneToMany(mappedBy = "TipoHabitacion")
    private List<Habitacion> habitaciones=new ArrayList<>();


    public int getIdTipoHabitacion() {
        return IdTipoHabitacion;
    }

    public void setIdTipoHabitacion(int idTipoHabitacion) {
        IdTipoHabitacion = idTipoHabitacion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getActivo() {
        return Activo;
    }

    public void setActivo(String activo) {
        Activo = activo;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
}
