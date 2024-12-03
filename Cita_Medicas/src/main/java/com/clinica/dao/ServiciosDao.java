package com.clinica.dao;

import com.clinica.domain.Servicios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiciosDao extends JpaRepository<Servicios, Long> {

}