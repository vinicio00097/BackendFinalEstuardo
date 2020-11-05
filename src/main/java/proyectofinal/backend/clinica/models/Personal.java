package proyectofinal.backend.clinica.models;

import javax.persistence.*;
import javax.websocket.OnMessage;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "PersonalHospital")
public class Personal {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) int IdPersonalHospital;
    private String NumeroDeEmpleado;
    private String PrimerNombre;
    private String SegundoNombre;
    private String PrimerApellido;
    private String SegundoApellido;
    private String ApellidoDeCasada;
    private String NIT;
    private String DPI;
    private String Telefono;
    private String Direccion;

    @ManyToOne
    @JoinColumn(name = "IdDepartamento")
    private DepartamentoEmpresa DepartamentoEmpresa;

    @ManyToOne
    @JoinColumn(name = "IdPuesto")
    private PuestoEmpresa PuestoEmpresa;

    @OneToMany(mappedBy = "Personal")
    private List<CitaPaciente> citaPacientes=new ArrayList<>();

    public int getIdEmpleado() {
        return IdPersonalHospital;
    }

    public void setIdEmpleado(int idPersonalHospital) {
        IdPersonalHospital = idPersonalHospital;
    }

    public String getNumeroDeEmpleado() {
        return NumeroDeEmpleado;
    }

    public void setNumeroDeEmpleado(String numeroDeEmpleado) {
        NumeroDeEmpleado = numeroDeEmpleado;
    }

    public String getPrimerNombre() {
        return PrimerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
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

    public String getApellidoCasada() {
        return ApellidoDeCasada;
    }

    public void setApellidoCasada(String apellidoDeCasada) {
        ApellidoDeCasada = apellidoDeCasada;
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

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getIdPersonalHospital() {
        return IdPersonalHospital;
    }

    public void setIdPersonalHospital(int idPersonalHospital) {
        IdPersonalHospital = idPersonalHospital;
    }

    public String getApellidoDeCasada() {
        return ApellidoDeCasada;
    }

    public void setApellidoDeCasada(String apellidoDeCasada) {
        ApellidoDeCasada = apellidoDeCasada;
    }

    public proyectofinal.backend.clinica.models.DepartamentoEmpresa getDepartamentoEmpresa() {
        return DepartamentoEmpresa;
    }

    public void setDepartamentoEmpresa(proyectofinal.backend.clinica.models.DepartamentoEmpresa departamentoEmpresa) {
        DepartamentoEmpresa = departamentoEmpresa;
    }

    public proyectofinal.backend.clinica.models.PuestoEmpresa getPuestoEmpresa() {
        return PuestoEmpresa;
    }

    public void setPuestoEmpresa(proyectofinal.backend.clinica.models.PuestoEmpresa puestoEmpresa) {
        PuestoEmpresa = puestoEmpresa;
    }

    public void setCitaPacientes(List<CitaPaciente> citaPacientes) {
        this.citaPacientes = citaPacientes;
    }
}
