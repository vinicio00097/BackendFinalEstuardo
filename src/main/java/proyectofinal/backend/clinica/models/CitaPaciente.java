package proyectofinal.backend.clinica.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "CitaPaciente")
public class CitaPaciente {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int IdCitaPaciente;

    private String FechaCita;

    @ManyToOne
    @JoinColumn(name = "IdPersonalHospital")
    private Personal Personal;

    @ManyToOne
    @JoinColumn(name = "IdPaciente")
    private Paciente Paciente;

    @OneToMany(mappedBy = "citaPaciente")
    private List<Receta> recetas=new ArrayList<>();

    public int getIdCitaPaciente() {
        return IdCitaPaciente;
    }

    public void setIdCitaPaciente(int idCitaPaciente) {
        IdCitaPaciente = idCitaPaciente;
    }

    public String getFechaCita() {
        return FechaCita;
    }

    public void setFechaCita(String fechaCita) {
        FechaCita = fechaCita;
    }

    public proyectofinal.backend.clinica.models.Personal getPersonal() {
        return Personal;
    }

    public void setPersonal(proyectofinal.backend.clinica.models.Personal personal) {
        Personal = personal;
    }

    public void setPaciente(proyectofinal.backend.clinica.models.Paciente paciente) {
        Paciente = paciente;
    }

    /*public proyectofinal.backend.clinica.models.Paciente getPaciente() {
        return Paciente;
    }*/

    public List<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(List<Receta> recetas) {
        this.recetas = recetas;
    }
}
