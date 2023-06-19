package yazmanireyesh.bootcampjava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusquedaController {
    @GetMapping("/busqueda-usuario/{busqueda}")
    public String[] obtenerPalabrasAutocompletar(@PathVariable String busqueda) {

        String[] frasesTipicasDeBusqueda = {"bootcamp de java", "bootcamp de python", "curso de nodejs"};

        String[] resultadoDeLaBusqueda = new String[10];
        int contador = 0;
        for (String frase: frasesTipicasDeBusqueda) {
            if (frase.contains(busqueda)) {
                resultadoDeLaBusqueda[contador] = frase;
                contador++;
            }
        }
        return resultadoDeLaBusqueda;
    }
}