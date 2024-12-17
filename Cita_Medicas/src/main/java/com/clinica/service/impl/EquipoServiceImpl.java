package com.clinica.service.impl;

import com.clinica.domain.Equipo;
import com.clinica.dao.EquipoDao;
import com.clinica.service.EquipoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipoServiceImpl implements EquipoService {

    @Autowired
    private EquipoDao equipoDao;

    @Override
    public List<Equipo> obtenerEquipos() {
        return equipoDao.findAll();
    }
}
