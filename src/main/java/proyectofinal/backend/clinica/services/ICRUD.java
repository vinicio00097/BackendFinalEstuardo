package proyectofinal.backend.clinica.services;

import java.util.List;
import java.util.Optional;

public interface ICRUD<T>{
    List<Object> getAll();
    Optional<Object> get(int id);
    List<Object> delete(int id);
    List<Object> update(T object);
    List<Object> save(T object);
}
