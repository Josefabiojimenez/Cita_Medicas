package com.clinica.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "maternidad")
public class Maternidad implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMaternidad")
    private Long id;

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String documentoIdentidad;
    private String seguroPrivado;
    
    public Maternidad() {
    }

    public Maternidad(String nombre, String apellido, String telefono, String email, String documentoIdentidad, String seguroPrivado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.documentoIdentidad = documentoIdentidad;
        this.seguroPrivado = seguroPrivado;
    }

}
