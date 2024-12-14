package com.clinica.dao;

import com.clinica.domain.CirugiaGeneral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CirugiaGeneralDao extends JpaRepository<CirugiaGeneral, Long> {

}