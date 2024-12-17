package com.clinica.dao;

import com.clinica.domain.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoDao extends JpaRepository<Contacto, Long> {

}