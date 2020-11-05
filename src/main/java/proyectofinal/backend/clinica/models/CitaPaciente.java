package proyectofinal.backend.clinica.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name = "CitaPaciente")
public class CitaPaciente {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int IdCitaPaciente;

    private Timestamp FechaCita;

    @ManyToOne
    @JoinColumn(name = "IdPersonalHospital")
    private Personal Personal;

    @ManyToOne
    @JoinColumn(name = "IdPacienteInternado")
    private PacienteInternado PacienteInternado;

    public int getIdCitaPaciente() {
        return IdCitaPaciente;
    }

    public void setIdCitaPaciente(int idCitaPaciente) {
        IdCitaPaciente = idCitaPaciente;
    }

    public Timestamp getFechaCita() {
        return FechaCita;
    }

    public void setFechaCita(Timestamp fechaCita) {
        FechaCita = fechaCita;
    }

    public proyectofinal.backend.clinica.models.Personal getPersonal() {
        return Personal;
    }

    public void setPersonal(proyectofinal.backend.clinica.models.Personal personal) {
        Personal = personal;
    }


    public void setPacienteInternado(proyectofinal.backend.clinica.models.PacienteInternado pacienteInternado) {
        PacienteInternado = pacienteInternado;
    }
}
