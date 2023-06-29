/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba1.DB;

import org.springframework.data.repository.CrudRepository;
import com.prueba1.Entities.Estudiante;
/**
 *
 * @author renan
 */

public interface IEstudianteRepository extends  CrudRepository<Estudiante, Integer>{
    
    
}
