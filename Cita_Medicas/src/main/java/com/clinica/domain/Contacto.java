package com.clinica.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "contacto")
public class Contacto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idContacto") 
    private Long id;

    private String nombre;
    private String apellido;
    private String email;
    private String mensaje;

    public Contacto() {
    }

    public Contacto(String nombre, String apellido, String email, String mensaje) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.mensaje = mensaje;
    }
}