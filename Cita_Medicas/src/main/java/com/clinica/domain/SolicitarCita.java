package com.clinica.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "solicitar_cita")
public class SolicitarCita implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCita") 
    private Long id;

    private String nombre;
    private String apellido;
    private String email;
    private String fechaCita;
    private String motivo;

    public SolicitarCita() {
    }

    public SolicitarCita(String nombre, String apellido, String email, String fechaCita, String motivo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaCita = fechaCita;
        this.motivo = motivo;
    }
}
