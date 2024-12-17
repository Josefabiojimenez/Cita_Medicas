package com.clinica.dao;

import com.clinica.domain.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreguntaDao extends JpaRepository<Pregunta, Long> {
}
