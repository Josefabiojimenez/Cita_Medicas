package com.clinica.dao;

import com.clinica.domain.Sugerencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SugerenciaDao extends JpaRepository<Sugerencia, Long> {

}
