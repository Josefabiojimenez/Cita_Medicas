package com.clinica.controller;

import com.clinica.domain.Presupuesto;
import com.clinica.service.PresupuestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PresupuestoController {
/*
    @Autowired
    private PresupuestoService presupuestoService;

    @GetMapping("/maternidad/presupuesto")
    public String mostrarFormulario(Model model) {
        model.addAttribute("maternidad", new Presupuesto());
        return "maternidad";
    }

    @PostMapping("/maternidad/presupuesto/enviar")
    public String guardarPresupuesto(Presupuesto presupuesto, Model model) {
        presupuestoService.guardarPresupuesto(presupuesto);
        model.addAttribute("mensaje", "¡Presupuesto enviado con éxito!");
        return "maternidad"; // Regresa al mismo template con el mensaje
    }*/
}
