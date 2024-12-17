package com.clinica.service.impl;

import com.clinica.dao.PreguntaDao;
import com.clinica.domain.Pregunta;
import com.clinica.service.PreguntaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreguntaServiceImpl implements PreguntaService {

    @Autowired
    private PreguntaDao preguntaDao;

    @Override
    public List<Pregunta> listarPreguntas() {
        return preguntaDao.findAll();
    }

    @Override
    public Pregunta obtenerPreguntaPorId(Long id) {
        return preguntaDao.findById(id).orElse(null);
    }

    @Override
    public void guardarPregunta(Pregunta pregunta) {
        preguntaDao.save(pregunta);
    }

    @Override
    public void eliminarPregunta(Long id) {
        preguntaDao.deleteById(id);
    }
}
