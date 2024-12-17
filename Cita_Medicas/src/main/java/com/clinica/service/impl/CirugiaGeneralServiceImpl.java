package com.clinica.service.impl;

import com.clinica.dao.CirugiaGeneralDao;
import com.clinica.domain.CirugiaGeneral;
import com.clinica.service.CirugiaGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CirugiaGeneralServiceImpl implements CirugiaGeneralService {
    private final CirugiaGeneralDao cirugiaGeneralDao;

    @Autowired
    public CirugiaGeneralServiceImpl(CirugiaGeneralDao cirugiaGeneralDao) {
        this.cirugiaGeneralDao = cirugiaGeneralDao;
    }

    @Override
    public void guardarCirugia(CirugiaGeneral cirugia) {
        cirugiaGeneralDao.save(cirugia);
    }
}