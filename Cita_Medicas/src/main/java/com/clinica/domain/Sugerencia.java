package com.clinica.domain;



import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "sugerencia") 
public class Sugerencia implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSugerencia") 
    private Long id;

    private String nombre;
    private String apellido;
    private String email;
    private String titulo;
    private String descripcion;

    public Sugerencia() {
    }

    public Sugerencia(String nombre, String apellido, String email, String titulo, String descripcion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }
}
