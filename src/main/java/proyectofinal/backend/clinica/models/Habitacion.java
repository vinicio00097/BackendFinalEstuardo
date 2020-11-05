package proyectofinal.backend.clinica.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Habitacion")
public class Habitacion {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) int IdHabitacion;
    private boolean HabitacionDisponible;
    private String Descripcion;

    @ManyToOne
    @JoinColumn(name = "IdUbicacion")
    private Ubicacion Ubicacion;
    private boolean Activo;

    @ManyToOne
    @JoinColumn(name = "IdTipoHabitacion")
    private TipoHabitacion TipoHabitacion;

    @ManyToOne
    @JoinColumn(name = "IdNivelEdificio")
    private NivelEdificio NivelEdificio;

    @OneToMany(mappedBy = "Habitacion")
    private List<PacienteInternado> internados=new ArrayList<>();


    public proyectofinal.backend.clinica.models.Ubicacion getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(proyectofinal.backend.clinica.models.Ubicacion ubicacion) {
        Ubicacion = ubicacion;
    }

    public proyectofinal.backend.clinica.models.TipoHabitacion getTipoHabitacion() {
        return TipoHabitacion;
    }

    public void setTipoHabitacion(proyectofinal.backend.clinica.models.TipoHabitacion tipoHabitacion) {
        TipoHabitacion = tipoHabitacion;
    }

    public proyectofinal.backend.clinica.models.NivelEdificio getNivelEdificio() {
        return NivelEdificio;
    }

    public void setNivelEdificio(proyectofinal.backend.clinica.models.NivelEdificio nivelEdificio) {
        NivelEdificio = nivelEdificio;
    }
    public int getIdHabitacion() {
        return IdHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        IdHabitacion = idHabitacion;
    }

    public boolean isHabitacionDisponible() {
        return HabitacionDisponible;
    }

    public void setHabitacionDisponible(boolean habitacionDisponible) {
        HabitacionDisponible = habitacionDisponible;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public boolean isActivo() {
        return Activo;
    }

    public void setActivo(boolean activo) {
        Activo = activo;
    }


    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public void setInternados(List<PacienteInternado> internados) {
        this.internados = internados;
    }
}
