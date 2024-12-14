package com.clinica.service.impl;

import com.clinica.dao.ServiciosDao;
import com.clinica.domain.Servicios;
import com.clinica.service.ServiciosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosServiceImpl implements ServiciosService {
    private final ServiciosDao serviciosDao;

    @Autowired
    public ServiciosServiceImpl(ServiciosDao serviciosDao) {
        this.serviciosDao = serviciosDao;
    }

    @Override
    public void guardarServicio(Servicios servicio) {
        serviciosDao.save(servicio);
    }
}