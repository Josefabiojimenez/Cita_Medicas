package com.clinica.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "presupuestos")
public class Presupuesto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String documentoIdentidad;
    private String seguroPrivado;
    
    public Presupuesto(){
    }

    public Presupuesto(String nombre, String apellido, String telefono, String email, String documentoIdentidad, String seguroPrivado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.documentoIdentidad = documentoIdentidad;
        this.seguroPrivado = seguroPrivado;
    }
    
    
}
