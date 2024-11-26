package com.clinica.controller;

import com.clinica.domain.Sugerencia;
import com.clinica.service.SugerenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sugerencias")
public class SugerenciasController1 {

    private final SugerenciaService sugerenciaService;

    @Autowired
    public SugerenciasController1(SugerenciaService sugerenciaService) {
        this.sugerenciaService = sugerenciaService;
    }

    @GetMapping
    public String mostrarFormulario(Model model) {
        model.addAttribute("sugerencia", new Sugerencia());
        return "sugerencias"; 
    }

    @PostMapping("/enviar")
    public String enviarSugerencia(@ModelAttribute Sugerencia sugerencia, Model model) {
        sugerenciaService.guardarSugerencia(sugerencia);
        return "redirect:/sugerencias/confirmacionSugerencia";
    }

    @GetMapping("/confirmacionSugerencia")
    public String mostrarConfirmacion(Model model) {
        model.addAttribute("mensaje", "Su sugerencia ha sido enviada con éxito.");
        return "sugerencias/confirmacionSugerencia"; 
    }
}
