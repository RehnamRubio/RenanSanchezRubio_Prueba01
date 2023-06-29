/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba1.Controllers;
import com.prueba1.Service.IEstudianteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author renan
 */

    @Controller
public class IndexController {
    private final IEstudianteService ProductService;
    public IndexController(IEstudianteService productService) {
        this.ProductService = productService;
    }
    
    @GetMapping("/")
    public String index(Model model) {
        var productos = this.ProductService.getAllEstudiante();
        model.addAttribute("products", productos);
        return "index";
    }
}
    
    

