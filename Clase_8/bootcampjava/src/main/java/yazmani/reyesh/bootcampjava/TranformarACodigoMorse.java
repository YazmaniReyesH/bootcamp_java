package yazmani.reyesh.bootcampjava;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranformarACodigoMorse {
    @GetMapping("/transformar-a-codigo-morse/{texto}")
    public String transformarACodigoMorse(@PathVariable String texto) {

        String codigoTransformado = "";
        for(int i = 0; i < texto.length(); i++) {
            String letraDeTexto = "" + texto.charAt(i);

            codigoTransformado = convertirLetraACodigoMorse(codigoTransformado, letraDeTexto);
        }
        return (codigoTransformado);
    }

    private static String convertirLetraACodigoMorse(String codigoTransformado, String letraDeTexto) {
        String[] tablaAbc = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", " "};
        String[] tablaCodigoMorse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", " "};

        for(int j = 0; j < tablaAbc.length; j++) {
            String letraTablaAbc = tablaAbc[j];
            if (letraTablaAbc.equalsIgnoreCase(letraDeTexto)) {
                String caracterEnCodigoMorse = tablaCodigoMorse[j];
                codigoTransformado += "" + caracterEnCodigoMorse;
            }
        }
        return codigoTransformado;
    }
}
