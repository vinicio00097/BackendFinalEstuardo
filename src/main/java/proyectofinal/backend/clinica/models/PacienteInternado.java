package proyectofinal.backend.clinica.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "PacienteInternado")
public class PacienteInternado {
    private @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int IdPacienteInternado;

    private String FechaIngreso;

    private String FechaSalida;

    @ManyToOne
    @JoinColumn(name = "IdPaciente")
    private Paciente Paciente;

    @ManyToOne
    @JoinColumn(name = "IdHabitacion")
    private Habitacion Habitacion;

    public int getIdPacienteInternado() {
        return IdPacienteInternado;
    }

    public void setIdPacienteInternado(int idPacienteInternado) {
        IdPacienteInternado = idPacienteInternado;
    }


    /*public proyectofinal.backend.clinica.models.Paciente getPaciente() {
        return Paciente;
    }*/

    public void setPaciente(proyectofinal.backend.clinica.models.Paciente paciente) {
        Paciente = paciente;
    }

    public proyectofinal.backend.clinica.models.Habitacion getHabitacion() {
        return Habitacion;
    }

    public void setHabitacion(proyectofinal.backend.clinica.models.Habitacion habitacion) {
        Habitacion = habitacion;
    }

    public String getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        FechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        FechaSalida = fechaSalida;
    }
}
