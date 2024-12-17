package com.clinica.controller;

import com.clinica.domain.Equipo;
import com.clinica.service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EquipoController {

    @Autowired
    private EquipoService equipoService;

    @GetMapping("/equipo")
    public String mostrarEquipo(Model model) {
        List<Equipo> equipos = equipoService.obtenerEquipos();
        model.addAttribute("equipos", equipos);
        return "/equipo";
    }
}
