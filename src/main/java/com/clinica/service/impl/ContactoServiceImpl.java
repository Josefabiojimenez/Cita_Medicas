package com.clinica.service.impl;

import com.clinica.dao.ContactoDao;
import com.clinica.domain.Contacto;
import com.clinica.service.ContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactoServiceImpl implements ContactoService {
    private final ContactoDao contactoDao;

    @Autowired
    public ContactoServiceImpl(ContactoDao contactoDao) {
        this.contactoDao = contactoDao;
    }

    @Override
    public void guardarContacto(Contacto contacto) {
        contactoDao.save(contacto);
    }
}