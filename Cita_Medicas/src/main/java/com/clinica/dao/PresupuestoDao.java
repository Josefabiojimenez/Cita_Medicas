package com.clinica.dao;

import com.clinica.domain.Presupuesto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresupuestoDao extends JpaRepository<Presupuesto, Long> {
}
