package proyectofinal.backend.clinica.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "PuestoEmpresa")
public class PuestoEmpresa {
    private @Id @GeneratedValue int IdPuesto;
    private String Descripcion;

    @OneToMany(mappedBy = "PuestoEmpresa")
    private List<Personal> personals=new ArrayList<>();

    public int getIdPuesto() {
        return IdPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        IdPuesto = idPuesto;
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
