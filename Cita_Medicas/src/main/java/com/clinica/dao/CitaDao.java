package com.clinica.dao;

// @author dsala

import com.clinica.domain.Cita;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CitaDao extends JpaRepository<Cita, Long> {
    
}
