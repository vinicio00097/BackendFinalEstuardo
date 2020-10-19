package proyectofinal.backend.clinica.models;


import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Ubicacion")
public class Ubicacion {

    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int IdUbicacion;

    @NotBlank
    private String Descripcion;

    @OneToMany(mappedBy = "Ubicacion")
    private List<Habitacion> habitaciones=new ArrayList<>();

    public int getIdUbicacion() {
        return IdUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        IdUbicacion = idUbicacion;
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
