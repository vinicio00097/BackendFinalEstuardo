package proyectofinal.backend.clinica.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "PresentacionMedicina")
public class PresentacionMedicina {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int IdPresentacion;

    private String Descripcion;

    /*@OneToMany(mappedBy = "presentacionMedicina")
    private List<Medicina> medicinas=new ArrayList<>();*/

    public int getIdPresentacion() {
        return IdPresentacion;
    }

    public void setIdPresentacion(int idPresentacion) {
        IdPresentacion = idPresentacion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    /*public List<Medicina> getMedicinas() {
        return medicinas;
    }*/

    /*public void setMedicinas(List<Medicina> medicinas) {
        this.medicinas = medicinas;
    }*/
}
