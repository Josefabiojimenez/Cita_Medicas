package com.clinica.service;

import com.clinica.domain.Usuario;
import jakarta.mail.MessagingException;
import org.springframework.ui.Model;

public interface RegistroService {

    Model activar(Model model, String usuario, String clave);

    Model crearUsuario(Model model, Usuario usuario) throws MessagingException;

    void activar(Usuario usuario);
    
    Model recordarUsuario(Model model, Usuario usuario) throws MessagingException;
}