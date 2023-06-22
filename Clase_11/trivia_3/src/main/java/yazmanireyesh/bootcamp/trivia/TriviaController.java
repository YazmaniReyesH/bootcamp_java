package yazmanireyesh.bootcamp.trivia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import yazmanireyesh.bootcamp.trivia.data.ListaCategorias;
import yazmanireyesh.bootcamp.trivia.data.ListaPreguntas;
import yazmanireyesh.bootcamp.trivia.entities.Categoria;
import yazmanireyesh.bootcamp.trivia.entities.Pregunta;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class TriviaController {
    @GetMapping("/question/{categoria}")
    public Pregunta getQuestion(@PathVariable String categoria) {

        List<Pregunta> miListaPreguntas = ListaPreguntas.getQuestionList();
        List<Pregunta> preguntaSeleccionCategoria = new ArrayList<>();

        for (Pregunta pregunta : miListaPreguntas) {
            if (pregunta.getCategory().equals(categoria)) {
                preguntaSeleccionCategoria.add(pregunta);
            }
        }

        Random random = new Random();
        int randomNumber;

        if(preguntaSeleccionCategoria.size() > 0){
            randomNumber = random.nextInt(preguntaSeleccionCategoria.size());
            return preguntaSeleccionCategoria.get(randomNumber);
        }else{
            randomNumber = random.nextInt(miListaPreguntas.size());
            return miListaPreguntas.get(randomNumber);
        }
    }

    @GetMapping("/categories")
    public List<Categoria> getCategories(){
        return ListaCategorias.getCategoriesList();
    }
}
