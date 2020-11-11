package proyectofinal.backend.clinica.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Receta")
public class Receta {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int IdReceta;

    private String FechaReceta;

    @ManyToOne
    @JoinColumn(name = "IdCitaPaciente")
    private CitaPaciente citaPaciente;

    @ManyToMany
    @JoinTable(
            name = "DetallesReceta",
            joinColumns = {
                    @JoinColumn(name = "IdReceta",referencedColumnName = "IdReceta")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "IdMedicina",referencedColumnName = "IdMedicina")
            }
    )
    private List<Medicina> medicinas;

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

    public List<Medicina> getMedicinas() {
        return medicinas;
    }

    public void setMedicinas(List<Medicina> medicinas) {
        this.medicinas = medicinas;
    }
}
