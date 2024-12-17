package com.clinica.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "cirugia_general")
public class CirugiaGeneral implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCirugia") 
    private Long id;

    private String nombre;
    private String tipo;
    private String descripcion;

    public CirugiaGeneral() {
    }

    public CirugiaGeneral(String nombre, String tipo, String descripcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }
}