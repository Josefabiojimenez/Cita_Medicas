package com.clinica.service;

import com.clinica.domain.Maternidad;
import java.util.List;

public interface MaternidadService {
    List<Maternidad> listarMaternidades();
    void guardarMaternidad(Maternidad maternidad);
}
