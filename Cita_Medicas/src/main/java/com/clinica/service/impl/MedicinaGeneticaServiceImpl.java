package com.clinica.service.impl;

import com.clinica.dao.MedicinaGeneticaDao;
import com.clinica.domain.MedicinaGenetica;
import com.clinica.service.MedicinaGeneticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicinaGeneticaServiceImpl implements MedicinaGeneticaService {

    private final MedicinaGeneticaDao medicinaGeneticaDao;

    @Autowired
    public MedicinaGeneticaServiceImpl(MedicinaGeneticaDao medicinaGeneticaDao) {
        this.medicinaGeneticaDao = medicinaGeneticaDao;
    }

    @Override
    public List<MedicinaGenetica> listarTodo() {
        return medicinaGeneticaDao.findAll();
    }
}
