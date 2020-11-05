package proyectofinal.backend.clinica.models;

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

    private Timestamp FechaIngreso;
    private Timestamp FechaSalida;

    @ManyToOne
    @JoinColumn(name = "IdPaciente")
    private Paciente Paciente;

    @ManyToOne
    @JoinColumn(name = "IdHabitacion")
    private Habitacion Habitacion;

    @OneToMany(mappedBy = "PacienteInternado")
    private List<CitaPaciente> citasPaciente=new ArrayList<>();

    public int getIdPacienteInternado() {
        return IdPacienteInternado;
    }

    public void setIdPacienteInternado(int idPacienteInternado) {
        IdPacienteInternado = idPacienteInternado;
    }

    public Timestamp getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(Timestamp fechaIngreso) {
        FechaIngreso = fechaIngreso;
    }

    public Timestamp getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(Timestamp fechaSalida) {
        FechaSalida = fechaSalida;
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

    public List<CitaPaciente> getCitasPaciente() {
        return citasPaciente;
    }

    public void setCitasPaciente(List<CitaPaciente> citasPaciente) {
        this.citasPaciente = citasPaciente;
    }
}
