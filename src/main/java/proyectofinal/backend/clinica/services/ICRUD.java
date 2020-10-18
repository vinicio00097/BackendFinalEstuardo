package proyectofinal.backend.clinica.services;

import java.util.List;
import java.util.Optional;

public interface ICRUD<T>{
    List<Object> getAll();
    Optional<Object> get(int id);
    Object delete(int id);
    Object update(T object);
}
