
package com.prueba1.Service;


import com.prueba1.Entities.Estudiante;
import java.util.List;

public interface IEstudianteService {
    List<Estudiante> getAllEstudiante();
     void save(Estudiante estudiante);

    void delete(Estudiante estudiante);
}
