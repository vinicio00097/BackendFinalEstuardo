package proyectofinal.backend.clinica.models;

import javax.persistence.*;

@Entity(name = "DetallesReceta")
public class DetallesReceta {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int IdDetalleReceta;

    @ManyToOne
    @JoinColumn(name = "IdMedicina")
    private Medicina medicina;

    @ManyToOne
    @JoinColumn(name = "IdReceta")
    private Receta receta;

    private int Cantidad;

    public int getIdDetalleReceta() {
        return IdDetalleReceta;
    }

    public void setIdDetalleReceta(int idDetalleReceta) {
        IdDetalleReceta = idDetalleReceta;
    }

    public Medicina getMedicina() {
        return medicina;
    }

    public void setMedicina(Medicina medicina) {
        this.medicina = medicina;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
}
