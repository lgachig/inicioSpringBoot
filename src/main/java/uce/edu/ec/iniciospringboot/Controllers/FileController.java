package uce.edu.ec.iniciospringboot.Controllers;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uce.edu.ec.iniciospringboot.Services.FileContent;

import javax.naming.Name;

@RestController()
@RequestMapping("/read")
public class FileController {

    private final FileContent fileContent;

    public FileController(FileContent fileContent) {
        this.fileContent = fileContent;
    }

    @GetMapping
    public ResponseEntity<String> read(@RequestParam String filePath){
        try{
            String file = fileContent.getFileContent(filePath);
            return ResponseEntity.ok(file);
        }catch (RuntimeException e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error de lectura");
        }
    }

}
