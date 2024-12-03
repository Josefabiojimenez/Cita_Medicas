package com.clinica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/maternidad")
public class MaternidadController {

    @GetMapping
    public String mostrarMaternidad(Model model) {
        // Aquí puedes añadir cualquier atributo al modelo si es necesario
        return "maternidad";  // Nombre de la vista para la sección de maternidad
    }
}
