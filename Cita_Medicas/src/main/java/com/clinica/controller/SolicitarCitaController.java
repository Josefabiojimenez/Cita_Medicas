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
@RequestMapping("/solicitarCita")
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

    @PostMapping("/enviar")
    public String enviarCita(SolicitarCita cita, Model model) {
        solicitarCitaService.guardarCita(cita);
        model.addAttribute("mensaje", "Su cita ha sido programada exitosamente.");
        return "redirect:/solicitarCita/confirmacionSolicitarCita";
    }

    @GetMapping("/confirmacionSolicitarCita")
    public String mostrarConfirmacion(Model model) {
        model.addAttribute("mensaje", "Su cita ha sido programada exitosamente.");
        return "solicitarCita/ConfirmacionSolicitarCita";
    }

}
