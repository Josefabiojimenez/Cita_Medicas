package com.clinica.service.impl;

import com.clinica.dao.MaternidadDao;
import com.clinica.domain.Maternidad;
import com.clinica.service.MaternidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaternidadServiceImpl implements MaternidadService {

    @Autowired
    private MaternidadDao maternidadDao;

    @Override
    public List<Maternidad> listarMaternidades() {
        return maternidadDao.findAll();
    }

    @Override
    public void guardarMaternidad(Maternidad maternidad) {
        maternidadDao.save(maternidad);
    }
}
