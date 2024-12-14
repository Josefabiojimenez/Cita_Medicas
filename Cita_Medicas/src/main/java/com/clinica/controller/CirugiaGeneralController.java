package com.clinica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cirugiaGeneral")
public class CirugiaGeneralController {

    @GetMapping
    public String mostrarCirugiaGeneral() {
        return "cirugiaGeneral"; 
    }
}