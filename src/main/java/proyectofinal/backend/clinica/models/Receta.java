package proyectofinal.backend.clinica.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Receta")
public class Receta {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int IdReceta;

    private String FechaReceta=new Timestamp(System.currentTimeMillis()).toString();

    @ManyToOne
    @JoinColumn(name = "IdCitaPaciente")
    private CitaPaciente citaPaciente;

    @OneToMany(mappedBy = "receta")
    private List<DetallesReceta> detallesRecetas;

    public List<DetallesReceta> getDetallesRecetas() {
        return detallesRecetas;
    }

    public void setDetallesRecetas(List<DetallesReceta> detallesRecetas) {
        this.detallesRecetas = detallesRecetas;
    }

    public int getIdReceta() {
        return IdReceta;
    }

    public void setIdReceta(int idReceta) {
        IdReceta = idReceta;
    }

    public String getFechaReceta() {
        return FechaReceta;
    }

    public void setFechaReceta(String fechaReceta) {
        FechaReceta = fechaReceta;
    }

    /*public CitaPaciente getCitaPaciente() {
        return citaPaciente;
    }*/

    public void setCitaPaciente(CitaPaciente citaPaciente) {
        this.citaPaciente = citaPaciente;
    }

}
