package yazmanireyesh.bootcamp.trivia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import yazmanireyesh.bootcamp.trivia.entities.Categoria;
import yazmanireyesh.bootcamp.trivia.entities.Pregunta;

@RestController
public class TriviaController {
    @GetMapping("/question/{categoria}")
    public Pregunta getQuestion(@PathVariable String categoria) {
        Pregunta preg = new Pregunta();
        preg.setCategory("Cultura");
        preg.setQuestion("¿Qué ingredientes se necesitan para hacer una michelada?");
        preg.setAnswer(0);
        preg.setExplanation("La michelada, originaria de México, nacida de la creatividad y el deseo de refrescar, se convirtió en una popular bebida que cautivó a los amantes de la cerveza con su combinación única de sabores y su espíritu festivo.");
        String[] options = new String[3];
        options[0] = "Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante";
        options[1] = "Cerveza, lima/limón y limon";
        options[2] = "Cerveza, sal, tabasco y lima/limón";
        preg.setOptions(options);
        return preg;

        /*return "{\n" +
                "  \"category\": \"Cultura\",\n" +
                "  \"question\": \"¿Qué ingredintes se necesitan para hacer una michelada?\",\n" +
                "  \"options\": [\"Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante\", \"Cerveza, lima/limón y limon\", \"Cerveza, sal, tabasco y lima/limón\"],\n" +
                "  \"answer\": 0,\n" +
                "  \"explanation\": \"La michelada, originaria de México, nacida de la creatividad y el deseo de refrescar, se convirtió en una popular bebida que cautivó a los amantes de la cerveza con su combinación única de sabores y su espíritu festivo.\"\n" +
                "}";*/
    }

    @GetMapping("/categories")
    public Categoria[] getCategories(){

        Categoria cat =new Categoria();
        cat.setCategory("Cultura");
        cat.setDescripcion("Preguntas relacionadas con arte, literatura, música y otras expresiones culturales.");

        Categoria cat2 =new Categoria();
        cat2.setCategory("Deportes");
        cat2.setDescripcion("Preguntas relacionadas con diversos deportes y eventos deportivos.");

        Categoria cat3 =new Categoria();
        cat3.setCategory("Arte");
        cat3.setDescripcion("Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.");

        Categoria cat4 =new Categoria();
        cat4.setCategory("Cine");
        cat4.setDescripcion("Preguntas relacionadas con películas, directores, actores y otros aspectos del cine.");

        Categoria cat5 =new Categoria();
        cat5.setCategory("Historia");
        cat5.setDescripcion("Preguntas relacionadas con eventos históricos, personajes y períodos importantes.");

        Categoria cat6 =new Categoria();
        cat6.setCategory("Ciencia");
        cat6.setDescripcion("Preguntas relacionadas con diferentes ramas de la ciencia, descubrimientos y avances científicos.");

        Categoria[] categorias = new Categoria[6];
        categorias[0] = cat;
        categorias[1] = cat2;
        categorias[2] = cat3;
        categorias[3] = cat4;
        categorias[4] = cat5;
        categorias[5] = cat6;

        return categorias;

        /*return "[\n" +
                "  {\n" +
                "    \"category\": \"Cultura\",\n" +
                "    \"description\": \"Preguntas relacionadas con arte, literatura, música y otras expresiones culturales.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Deportes\",\n" +
                "    \"description\": \"Preguntas relacionadas con diversos deportes y eventos deportivos.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Arte\",\n" +
                "    \"description\": \"Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Cine\",\n" +
                "    \"description\": \"Preguntas relacionadas con películas, directores, actores y otros aspectos del cine.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Historia\",\n" +
                "    \"description\": \"Preguntas relacionadas con eventos históricos, personajes y períodos importantes.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Ciencia\",\n" +
                "    \"description\": \"Preguntas relacionadas con diferentes ramas de la ciencia, descubrimientos y avances científicos.\"\n" +
                "  }\n" +
                "]";*/
    }
}
