package uce.edu.ec.iniciospringboot.Services;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class FileContent {

    public String getFileContent(String filePath){
        try{
            Path ruta = Paths.get(filePath);
            return Files.readString(ruta);
        } catch (IOException e) {
            throw new RuntimeException("Error de Lectura" + e.getMessage(), e);
        }
    }

}
