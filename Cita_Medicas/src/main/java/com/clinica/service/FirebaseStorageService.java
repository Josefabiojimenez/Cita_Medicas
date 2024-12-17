
package com.clinica.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    
    /*Constantes*/

    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "clinica-f5d54.appspot.com";

    //Esta es la ruta básica de este proyecto Clinica
    final String rutaSuperiorStorage = "clinica";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "clinica-f5d54-firebase-adminsdk-f4ces-5652c79fc3.json";
}
