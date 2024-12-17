package com.clinica.controller;

import com.clinica.domain.Pregunta;
import com.clinica.service.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PreguntaController {

    @Autowired
    private PreguntaService preguntaService;

    @GetMapping("/preguntasFrecuentes")
    public String mostrarPreguntasFrecuentes(Model model) {
        List<Pregunta> preguntas = preguntaService.listarPreguntas();
        model.addAttribute("preguntas", preguntas);
        return "/pregunta";
    }
}
