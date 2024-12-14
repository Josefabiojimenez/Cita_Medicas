package com.clinica.dao;

import com.clinica.domain.Maternidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaternidadDao extends JpaRepository<Maternidad, Long> {

}
