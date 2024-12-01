package com.clinica.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "servicios")
public class Servicios implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idServicio") 
    private Long id;

    private String nombre;
    private String descripcion;

    public Servicios() {
    }

    public Servicios(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}