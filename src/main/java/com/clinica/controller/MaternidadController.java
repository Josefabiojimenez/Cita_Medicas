package com.clinica.controller;

import com.clinica.domain.Maternidad;
import com.clinica.service.MaternidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/maternidad")
public class MaternidadController {

    @Autowired
    private MaternidadService maternidadService;

    
    @GetMapping("")
    public String mostrarPaginaMaternidad(Model model) {
        model.addAttribute("maternidad", new Maternidad()); 
        return "maternidad/maternidad"; 
    }

    
    @PostMapping("/presupuesto/enviar")
    public String enviarPresupuesto(@ModelAttribute Maternidad maternidad, Model model) {
        maternidadService.guardarMaternidad(maternidad);
        model.addAttribute("mensaje", "Su solicitud se ha sido enviado exitosamente.");
        return "maternidad/confirmacionMaternidad";
    }
}
