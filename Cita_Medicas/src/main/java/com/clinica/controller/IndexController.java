package com.clinica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/inicio") 
    public String inicio(Model model) {
        model.addAttribute("titulo", "Bienvenido a Clínica MediHub");
        return "index";
    }
}

