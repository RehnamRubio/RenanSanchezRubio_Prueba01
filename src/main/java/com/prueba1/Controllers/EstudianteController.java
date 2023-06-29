
package com.prueba1.Controllers;


import com.prueba1.Entities.Estudiante;
import com.prueba1.Service.IEstudianteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EstudianteController {
    private final IEstudianteService ProductService;
    public EstudianteController(IEstudianteService ProductService) {
        this.ProductService = ProductService;
    }
    @GetMapping("/product")
    public String index(Model model) {
        model.addAttribute("product", new Estudiante());
        model.addAttribute("products", this.ProductService.getAllEstudiante());
        return "product";
    }
    @PostMapping("product/save")
    public String save(@ModelAttribute("product") Estudiante product) {
        this.ProductService.save(product);
        return "redirect:/product";
    }
    @PostMapping("product/delete")
    public ResponseEntity<String> delete(@RequestBody Estudiante product) {
        this.ProductService.delete(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}