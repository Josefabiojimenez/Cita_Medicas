package com.clinica.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "equipo")
public class Equipo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equipo")
    private Long id;

    private String nombre;
    private String especialidad;
    private String descripcion;
    private String imagen; 

    
    public Equipo() {
    }

    
    public Equipo(String nombre, String especialidad, String descripcion, String imagen) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }
}
