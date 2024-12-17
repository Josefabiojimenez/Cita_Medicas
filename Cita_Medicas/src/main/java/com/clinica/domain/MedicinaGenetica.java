package com.clinica.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "medicina_genetica")
public class MedicinaGenetica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    private String videoUrl;
}
