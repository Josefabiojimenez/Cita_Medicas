package com.clinica.controller;

import com.clinica.domain.Cita;
import com.clinica.service.CitaService;
import com.clinica.service.impl.FirebaseStorageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/cita") //para simplifica, o sea por ejemplo ya no se debe escribir cita para llegar a los metodos xq responde a todo lo que sea /cita
public class CitaController {

    @Autowired
    private CitaService citaService;

    @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService;

    @GetMapping("/listado") //para obtener la lista mediante la peticion de un URL
    public String inicio(Model model) {
        var citas = citaService.getCitas();
        model.addAttribute("citas", citas);
        model.addAttribute("totalCitas", citas.size());
        return "/cita/listado";
    }

    /*@GetMapping("/nuevo")
    public String citaNuevo(Cita cita) {
        return "/cita/modifica";
    }*/
    @PostMapping("/guardar")
    public String citaGuardar(Cita cita,
            @RequestParam("imagenFile") MultipartFile imagenFile) {
        if (!imagenFile.isEmpty()) {
            citaService.save(cita); 
            cita.setRutaImagen(
                    firebaseStorageService.cargaImagen(
                            imagenFile,
                            "cita",
                            cita.getIdCita())); 
        }
        citaService.save(cita); 
        return "redirect:/cita/listado";  
    }

    //los getMapping responden a los botones
    @GetMapping("/eliminar/{idCita}")
    public String citaEliminar(Cita cita) {
        citaService.delete(cita);
        return "redirect:/cita/listado";
    }

    @GetMapping("/modificar/{idCita}")
    public String citaModificar(Cita cita, Model model) {
        cita = citaService.getCita(cita);
        model.addAttribute("cita", cita);
        return "/cita/modifica";
    }
}
