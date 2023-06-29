
package com.prueba1.Service.impl;

import com.prueba1.DB.IEstudianteRepository;
import com.prueba1.Entities.Estudiante;
import com.prueba1.Service.IEstudianteService;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class EstudianteService implements IEstudianteService {
    private final IEstudianteRepository productRepository;
    public EstudianteService(IEstudianteRepository productRepository ){
        this.productRepository= productRepository ;
        
       
     }
    public List<Estudiante> getAllProducts() {
        return (List<Estudiante>) this.productRepository.findAll();
    }
    
    public void save(Estudiante product) {
        product.setGenero("");
        this.productRepository.save(product);
    }
    public void delete(Estudiante product) {
        this.productRepository.delete(product);
    }

    @Override
    public List<Estudiante> getAllEstudiante() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
    
    
    
    
    
}
