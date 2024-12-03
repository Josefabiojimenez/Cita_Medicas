package com.clinica.service.impl;

import com.clinica.dao.PresupuestoDao;
import com.clinica.domain.Presupuesto;
import com.clinica.service.PresupuestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PresupuestoServiceImpl implements PresupuestoService {

    @Autowired
    private PresupuestoDao presupuestoDao;

    @Override
    public void guardarPresupuesto(Presupuesto presupuesto) {
        presupuestoDao.save(presupuesto);
    }
}
