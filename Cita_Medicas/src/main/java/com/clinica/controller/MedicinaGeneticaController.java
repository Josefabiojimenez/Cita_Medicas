package com.clinica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/medicinaGenetica")
public class MedicinaGeneticaController {

    @GetMapping
    public String mostrarMedicinaGenetica(Model model) {
        model.addAttribute("titulo", "Medicina Genética");
        return "/MedicinaGenetica"; 
    }
}
