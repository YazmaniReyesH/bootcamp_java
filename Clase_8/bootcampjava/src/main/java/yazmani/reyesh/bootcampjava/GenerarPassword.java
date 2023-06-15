package yazmani.reyesh.bootcampjava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenerarPassword {
    @GetMapping("/generar-password")
    public String generarPassword() {
        double aleatorio = Math.random() * 1000000;
        long numeroAleatorio = Math.round(aleatorio);
        String password = "yrhz" + numeroAleatorio;
        return (password);
    }
}
