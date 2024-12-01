package com.clinica.controller;

import com.clinica.domain.SolicitarCita;
import com.clinica.service.SolicitarCitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/solitarCita")
public class SolicitarCitaController {

    private final SolicitarCitaService solicitarCitaService;

    @Autowired
    public SolicitarCitaController(SolicitarCitaService solicitarCitaService) {
        this.solicitarCitaService = solicitarCitaService;
    }

    @GetMapping
    public String mostrarFormularioCita(Model model) {
        model.addAttribute("cita", new SolicitarCita());
        return "/solicitarCita"; 
    }

    /*@PostMapping
    public String enviarCita(SolicitarCita cita) {
        solicitarCitaService.guardarCita(cita);
        return "redirect:/citas/exito"; 
    }

    @GetMapping("/exito")
    public String mostrarExito() {
        return "exito"; 
    }*/
}