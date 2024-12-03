package com.clinica.service.impl;

import com.clinica.dao.CitaDao;
import com.clinica.domain.Cita;
import com.clinica.service.CitaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dsala
 */
@Service
public class CitaServiceImpl implements CitaService {

    @Autowired
    private CitaDao citaDao;



    @Override
    public List<Cita> getCitas() {
        List<Cita> lista = citaDao.findAll();

        //lista.removeIf(e -> !e.isActivo());

        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Cita getCita(Cita cita) {
        return citaDao.findById(cita.getIdCita()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Cita cita) {
        citaDao.save(cita);
    }

    @Override
    @Transactional
    public void delete(Cita cita) {
        citaDao.delete(cita);
    }

}
