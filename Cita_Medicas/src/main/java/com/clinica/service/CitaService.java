package com.clinica.service;

import com.clinica.domain.Cita;
import java.util.List;


public interface CitaService {

    
    public List<Cita> getCitas();

    
    public Cita getCita(Cita cita);

   
    public void save(Cita cita);

    
    public void delete(Cita cita);

}

