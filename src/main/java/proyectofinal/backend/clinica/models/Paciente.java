package proyectofinal.backend.clinica.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Paciente")
public class Paciente {
    private @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) int IdPaciente;

    private String PrimerNombre;
    private String SegundoNombre;
    private String PrimerApellido;
    private String SegundoApellido;
    private String TercerApellido;
    private String ApellidoCasada;
    private String NIT;
    private String DPI;

    @OneToMany(mappedBy = "Paciente")
    private List<PacienteInternado> internados=new ArrayList<>();

    public int getIdPaciente() {
        return IdPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        IdPaciente = idPaciente;
    }

    public String getPrimeroNombre() {
        return PrimerNombre;
    }

    public void setPrimeroNombre(String primerNombre) {
        PrimerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return SegundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        SegundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        PrimerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        SegundoApellido = segundoApellido;
    }

    public String getTercerApellido() {
        return TercerApellido;
    }

    public void setTercerApellido(String tercerApellido) {
        TercerApellido = tercerApellido;
    }

    public String getApellidoCasada() {
        return ApellidoCasada;
    }

    public void setApellidoCasada(String apellidoCasada) {
        ApellidoCasada = apellidoCasada;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public void setInternados(List<PacienteInternado> internados) {
        this.internados = internados;
    }

    public List<PacienteInternado> getInternados() {
        return internados;
    }
}
