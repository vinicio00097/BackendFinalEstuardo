package proyectofinal.backend.clinica.services;

import proyectofinal.backend.clinica.models.Paciente;

import java.util.List;

public interface IPacientes extends ICRUD<Paciente>{
    public List<Object> updateInternados(Paciente obj);
}
