package com.clinica.dao;

import com.clinica.domain.MedicinaGenetica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicinaGeneticaDao extends JpaRepository<MedicinaGenetica, Long> {
}
