package proyectofinal.backend.clinica.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Medicina")
public class Medicina {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int IdMedicina;

    private String Descripcion;
    private String Observaciones;

    /*@ManyToOne
    @JoinColumn(name = "IdTipoMedicina")
    private TipoMedicina tipoMedicina;

    @ManyToOne
    @JoinColumn(name = "IdPresentacionMedicina")
    private PresentacionMedicina presentacionMedicina;*/

    @OneToMany(mappedBy = "medicina")
    private List<DetallesReceta> detallesRecetas;

    private Boolean Activo;

    private String FechaCreacion;
    private String UsuarioCreacion;
    private int Existencia;

    public int getIdMedicina() {
        return IdMedicina;
    }

    public void setIdMedicina(int idMedicina) {
        IdMedicina = idMedicina;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String observaciones) {
        Observaciones = observaciones;
    }

    /*public TipoMedicina getTipoMedicina() {
        return tipoMedicina;
    }

    public void setTipoMedicina(TipoMedicina tipoMedicina) {
        this.tipoMedicina = tipoMedicina;
    }

    public PresentacionMedicina getPresentacionMedicina() {
        return presentacionMedicina;
    }

    public void setPresentacionMedicina(PresentacionMedicina presentacionMedicina) {
        this.presentacionMedicina = presentacionMedicina;
    }*/

    public Boolean getActivo() {
        return Activo;
    }

    public void setActivo(Boolean activo) {
        Activo = activo;
    }

    public String getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        FechaCreacion = fechaCreacion;
    }

    public String getUsuarioCreacion() {
        return UsuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        UsuarioCreacion = usuarioCreacion;
    }

    public int getExistencia() {
        return Existencia;
    }

    public void setExistencia(int existencia) {
        Existencia = existencia;
    }
}
