package proyectofinal.backend.clinica.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "TipoMedicina")
public class TipoMedicina {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int IdTipoMedicina;

    private String Descripcion;

    /*@OneToMany(mappedBy = "tipoMedicina")
    private List<Medicina> medicinas=new ArrayList<>();*/

    public int getIdTipoMedicina() {
        return IdTipoMedicina;
    }

    public void setIdTipoMedicina(int idTipoMedicina) {
        IdTipoMedicina = idTipoMedicina;
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
