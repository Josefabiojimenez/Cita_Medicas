/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.clinica.controller;

import com.clinica.domain.Presupuesto;
import com.clinica.service.PresupuestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author XPC
 */
@Controller
@RequestMapping("/presupuesto")
public class PresupuestoController {
    
private final PresupuestoService presupuestoService;

    @Autowired
    public PresupuestoController(PresupuestoService presupuestoService) {
        this.presupuestoService = presupuestoService;
    }

    @GetMapping
    public String mostrarFormulario(Model model) {
        model.addAttribute("presupuesto", new Presupuesto());
        return "presupuesto"; 
    }

    @PostMapping("/enviar")
    public String enviarPresupuesto(@ModelAttribute Presupuesto presupuesto, Model model) {
        presupuestoService.guardarPresupuesto(presupuesto);
        return "redirect:/presupuesto/confirmacionPresupuesto";
    }

    @GetMapping("/confirmacionPresupuesto")
    public String mostrarConfirmacion(Model model) {
        model.addAttribute("mensaje", "Su solicitud de presupuesto ha sido enviada con éxito.");
        return "presupuesto/confirmacionPresupuesto";  
    }
    
}
