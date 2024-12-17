package com.clinica.service;

import jakarta.mail.MessagingException;

public interface CorreoService {
    void enviarCorreoHtml(String destinatario, 
            String asunto, 
            String mensaje) 
            throws MessagingException;
}