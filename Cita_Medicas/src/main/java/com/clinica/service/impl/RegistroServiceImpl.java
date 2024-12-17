package com.clinica.service.impl;

import com.clinica.domain.Usuario;
import com.clinica.service.CorreoService;
import com.clinica.service.RegistroService;
import com.clinica.service.UsuarioService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.Locale;

@Service
public class RegistroServiceImpl implements RegistroService {

    @Autowired
    private CorreoService correoService;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private MessageSource messageSource;

    @Value("${servidor.http}")
    private String servidor;

    @Override
    public void activar(Usuario usuario) {
        var codigo = new BCryptPasswordEncoder();
        usuario.setPassword(codigo.encode(usuario.getPassword()));
        usuarioService.save(usuario);
    }

    @Override
    public Model crearUsuario(Model model, Usuario usuario) throws MessagingException {
        String mensaje;
        if (!usuarioService.existeUsuarioPorUsernameOCorreo(usuario.getUsername(), usuario.getCorreo())) {
            String clave = demeClave();
            usuario.setPassword(clave);
            usuario.setActivo(true);
            usuarioService.save(usuario);
            enviaCorreoActivar(usuario, clave); // Enviar correo de activación
            mensaje = messageSource.getMessage("registro.mensaje.usuario.creado", null, Locale.getDefault());
        } else {
            mensaje = String.format(messageSource.getMessage("registro.mensaje.usuario.o.correo", null, Locale.getDefault()), usuario.getUsername(), usuario.getCorreo());
        }
        model.addAttribute("titulo", messageSource.getMessage("registro.activar", null, Locale.getDefault()));
        model.addAttribute("mensaje", mensaje);
        return model;
    }

    @Override
    public Model recordarUsuario(Model model, Usuario usuario) throws MessagingException {
        String mensaje;
        Usuario usuarioExistente = usuarioService.getUsuarioPorUsernameOCorreo(usuario.getUsername(), usuario.getCorreo());
        if (usuarioExistente != null) {
            String nuevaClave = demeClave();
            usuarioExistente.setPassword(new BCryptPasswordEncoder().encode(nuevaClave));
            usuarioService.save(usuarioExistente);
            enviaCorreoRecordar(usuarioExistente, nuevaClave); // Enviar correo de recordar
            mensaje = messageSource.getMessage("registro.mensaje.recordar.ok", null, Locale.getDefault());
        } else {
            mensaje = String.format(messageSource.getMessage("registro.mensaje.usuario.o.correo", null, Locale.getDefault()), usuario.getUsername(), usuario.getCorreo());
        }
        model.addAttribute("titulo", messageSource.getMessage("registro.recordar.titulo", null, Locale.getDefault()));
        model.addAttribute("mensaje", mensaje);
        return model;
    }

    private String demeClave() {
        String tira = "ABCDEFGHIJKLMNOPQRSTUXYZabcdefghijklmnopqrstuvwxyz0123456789_*+-";
        StringBuilder clave = new StringBuilder();
        for (int i = 0; i < 40; i++) {
            clave.append(tira.charAt((int) (Math.random() * tira.length())));
        }
        return clave.toString();
    }

    private void enviaCorreoActivar(Usuario usuario, String clave) throws MessagingException {
        String mensaje = messageSource.getMessage("registro.correo.activar", null, Locale.getDefault());
        mensaje = String.format(mensaje, usuario.getNombre(), servidor, usuario.getUsername(), clave);
        String asunto = messageSource.getMessage("registro.mensaje.activacion", null, Locale.getDefault());
        correoService.enviarCorreoHtml(usuario.getCorreo(), asunto, mensaje);
    }

    private void enviaCorreoRecordar(Usuario usuario, String clave) throws MessagingException {
        String mensaje = messageSource.getMessage("registro.correo.recordar", null, Locale.getDefault());
        mensaje = String.format(mensaje, usuario.getNombre(), servidor, usuario.getUsername(), clave);
        String asunto = messageSource.getMessage("registro.mensaje.recordar", null, Locale.getDefault());
        correoService.enviarCorreoHtml(usuario.getCorreo(), asunto, mensaje);
    }

    @Override
    public Model activar(Model model, String usuario, String clave) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}