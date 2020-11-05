package proyectofinal.backend.clinica.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "DepartamentoEmpresa")
public class DepartamentoEmpresa {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) int IdDepartamento;
    private String Descripcion;

    @OneToMany(mappedBy = "DepartamentoEmpresa")
    private List<Personal> personals=new ArrayList<>();

    public int getIdDepartamento() {
        return IdDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        IdDepartamento = idDepartamento;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public void setPersonals(List<Personal> personals) {
        this.personals = personals;
    }
}
