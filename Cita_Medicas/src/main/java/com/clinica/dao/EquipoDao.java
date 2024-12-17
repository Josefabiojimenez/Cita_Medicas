package com.clinica.dao;

import com.clinica.domain.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipoDao extends JpaRepository<Equipo, Long> {
}
