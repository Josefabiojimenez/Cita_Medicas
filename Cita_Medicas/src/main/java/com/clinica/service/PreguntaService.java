package com.clinica.service;

import com.clinica.domain.Pregunta;
import java.util.List;

public interface PreguntaService {
    List<Pregunta> listarPreguntas();
    Pregunta obtenerPreguntaPorId(Long id);
    void guardarPregunta(Pregunta pregunta);
    void eliminarPregunta(Long id);
}
