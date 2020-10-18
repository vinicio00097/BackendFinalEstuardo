package proyectofinal.backend.clinica.models;


import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity(name = "Ubicacion")
public class Ubicacion {

    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int IdUbicacion;

    @NotBlank
    private String Descripcion;
}
