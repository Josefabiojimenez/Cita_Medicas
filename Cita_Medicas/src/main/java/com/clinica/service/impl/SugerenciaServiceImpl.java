package com.clinica.service.impl;

import com.clinica.dao.SugerenciaDao;
import com.clinica.domain.Sugerencia;
import com.clinica.service.SugerenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SugerenciaServiceImpl implements SugerenciaService {
    private final SugerenciaDao sugerenciaDao;

    @Autowired
    public SugerenciaServiceImpl(SugerenciaDao sugerenciaDao) {
        this.sugerenciaDao = sugerenciaDao;
    }

    @Override
    public void guardarSugerencia(Sugerencia sugerencia) {
        sugerenciaDao.save(sugerencia);
    }

    /*@Override
    public List<Sugerencia> obtenerSugerencias() {
        return sugerenciaDao.findAll();
    }*/
}