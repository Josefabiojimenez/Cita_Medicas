package com.clinica.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Data;

@Data
@Entity
@Table(name = "cita")
public class Cita implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCita")
    private Long idCita;
    
    private String nombre; 
    private LocalDate fecha;
    private LocalTime hora;
    private String servicio; 
    private String telefono;
    private String rutaImagen;

    public Cita() {
    }

    public Cita(String nombre, LocalDate fecha, LocalTime hora, String servicio, String telefono, String rutaImagen) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.servicio = servicio;
        this.telefono = telefono;
        this.rutaImagen = rutaImagen;
    }

    
}
