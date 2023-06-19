package yazmanireyesh.bootcampjava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class BuscarAgregarEliminarController {
    String[] personas;

    @GetMapping("/persona/agregar/{nombre}")
    public String agregarPersona(@PathVariable String nombre) {
        String[] personasTemporal;
        if (personas != null){
            personasTemporal = Arrays.copyOf(personas, personas.length + 1);
        } else {
            personasTemporal = new String[1];
        }
        personasTemporal[personasTemporal.length-1] = nombre;
        personas = personasTemporal;
        return "<p>Se agregó a " + nombre + "</p>";
    }

    @GetMapping("/persona/buscar/{nombre}")
    public String buscarPersona(@PathVariable String nombre){
        int contador = 0;
        String response = "";
        if (personas == null) {
            response = "<h2>No se encontraron resultados</h2>";
        } else {
            for (String persona : personas) {
                if (persona.toLowerCase().contains(nombre.toLowerCase())) {
                    contador++;
                    if (contador == 1) response = "<h1>Se encontraron resultados<h1>";
                    response += "<li>" + persona + "</li>";
                }
            }
            if (contador == 0) {
                response = "No se encontraron resultados";
            }
        }
        return response;
    }

    // Método eliminar persona
    @GetMapping("/persona/eliminar/{nombre}")
    public String eliminarPersona(@PathVariable String nombre){
        String[] personasTemporal = personas;
        int contador = 0;
        for (String persona : personas) {
            if (!persona.toLowerCase().contains(nombre.toLowerCase())) {
                personasTemporal[contador] = persona;
                contador++;
            }
        }
        if(contador == personas.length){
            return "<p>No se encontraron coincidencias con " + nombre + "</p>";
        } else {
            personas = Arrays.copyOf(personasTemporal, contador);
            return "<p>Se eliminaron las coincidencias con " + nombre + "</p>";
        }
    }
}
