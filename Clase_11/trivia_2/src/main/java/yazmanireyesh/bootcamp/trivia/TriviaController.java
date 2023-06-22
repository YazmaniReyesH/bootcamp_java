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

        Pregunta pregunta = getPregunta(categoria);
        return pregunta;
    }

    @GetMapping("/categories")
    public Categoria[] getCategories(){

        Categoria categoriaCultura =new Categoria();
        categoriaCultura.setCategory("Cultura");
        categoriaCultura.setDescripcion("Preguntas relacionadas con arte, literatura, música y otras expresiones culturales.");

        Categoria categoriaDeportes =new Categoria();
        categoriaDeportes.setCategory("Deportes");
        categoriaDeportes.setDescripcion("Preguntas relacionadas con diversos deportes y eventos deportivos.");

        Categoria categoriaArte =new Categoria();
        categoriaArte.setCategory("Arte");
        categoriaArte.setDescripcion("Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.");

        Categoria categoriaCine =new Categoria();
        categoriaCine.setCategory("Cine");
        categoriaCine.setDescripcion("Preguntas relacionadas con películas, directores, actores y otros aspectos del cine.");

        Categoria categoriaHistoria =new Categoria();
        categoriaHistoria.setCategory("Historia");
        categoriaHistoria.setDescripcion("Preguntas relacionadas con eventos históricos, personajes y períodos importantes.");

        Categoria categoriaCiencia =new Categoria();
        categoriaCiencia.setCategory("Ciencia");
        categoriaCiencia.setDescripcion("Preguntas relacionadas con diferentes ramas de la ciencia, descubrimientos y avances científicos.");

        Categoria[] categorias = new Categoria[6];
        categorias[0] = categoriaCultura;
        categorias[1] = categoriaDeportes;
        categorias[2] = categoriaArte;
        categorias[3] = categoriaCine;
        categorias[4] = categoriaHistoria;
        categorias[5] = categoriaCiencia;

        return categorias;
    }

    private Pregunta getPregunta(String categoria){
        Pregunta pregunta = new Pregunta();

        if(categoria.equals("Cultura")) pregunta = getPreguntaCultura();
        if(categoria.equals("Deportes")) pregunta = getPreguntaDeportes();
        if(categoria.equals("Arte")) pregunta = getPreguntaArte();
        if(categoria.equals("Cine")) pregunta = getPreguntaCine();
        if(categoria.equals("Historia")) pregunta = getPreguntaHistoria();
        if(categoria.equals("Ciencia")) pregunta = getPreguntaCiencia();

        return pregunta;
    }

    private Pregunta getPreguntaCultura(){

        Pregunta preguntaCultura = new Pregunta();
        preguntaCultura.setCategory("Cultura");
        preguntaCultura.setQuestion("¿Qué ingredientes se necesitan para hacer una michelada?");
        String[] options = new String[3];
        options[0] = "Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante";
        options[1] = "Cerveza, lima/limón y limon";
        options[2] = "Cerveza, sal, tabasco y lima/limón";
        preguntaCultura.setOptions(options);
        preguntaCultura.setAnswer(0);
        preguntaCultura.setExplanation("La michelada, originaria de México, nacida de la creatividad y el deseo de refrescar, se convirtió en una popular bebida que cautivó a los amantes de la cerveza con su combinación única de sabores y su espíritu festivo.");
        return preguntaCultura;
    }

    private Pregunta getPreguntaDeportes() {

        Pregunta preguntaDeportes = new Pregunta();
        preguntaDeportes.setCategory("Deportes");
        preguntaDeportes.setQuestion("¿Cuál es el deporte más popular en el mundo?");
        String[] options = new String[3];
        options[0] = "Fútbol";
        options[1] = "Baloncesto";
        options[2] = "Tenis";
        preguntaDeportes.setOptions(options);
        preguntaDeportes.setAnswer(0);
        preguntaDeportes.setExplanation("El fútbol es ampliamente considerado como el deporte más popular en el mundo, con miles de millones de seguidores y una amplia participación a nivel mundial.");
        return preguntaDeportes;
    }

    private Pregunta getPreguntaArte(){

        Pregunta preguntaArte = new Pregunta();
        preguntaArte.setCategory("Arte");
        preguntaArte.setQuestion("¿Quién pintó la Mona Lisa?");
        String[] options = new String[3];
        options[0] = "Leonardo da Vinci";
        options[1] = "Pablo Picasso";
        options[2] = "Vincent van Gogh";
        preguntaArte.setOptions(options);
        preguntaArte.setAnswer(0);
        preguntaArte.setExplanation("La Mona Lisa es una famosa pintura renacentista creada por el artista italiano Leonardo da Vinci.");
        return preguntaArte;
    }

    private Pregunta getPreguntaCine(){

        Pregunta preguntaCine = new Pregunta();
        preguntaCine.setCategory("Cine");
        preguntaCine.setQuestion("¿Quién dirigió la película \\\"El Padrino\\\"?");
        String[] options = new String[3];
        options[0] = "Francis Ford Coppola";
        options[1] = "Martin Scorsese";
        options[2] = "Steven Spielberg";
        preguntaCine.setOptions(options);
        preguntaCine.setAnswer(0);
        preguntaCine.setExplanation("La película \\\"El Padrino\\\" fue dirigida por Francis Ford Coppola, y es considerada como una de las mejores películas de la historia del cine.");
        return preguntaCine;
    }

    private Pregunta getPreguntaHistoria(){

        Pregunta preguntaHistoria = new Pregunta();
        preguntaHistoria.setCategory("Historia");
        preguntaHistoria.setQuestion("¿En qué año se firmó la Declaración de Independencia de los Estados Unidos?");
        String[] options = new String[3];
        options[0] = "1776";
        options[1] = "1789";
        options[2] = "1812";
        preguntaHistoria.setOptions(options);
        preguntaHistoria.setAnswer(0);
        preguntaHistoria.setExplanation("La Declaración de Independencia de los Estados Unidos fue firmada en el año 1776, marcando el inicio de la independencia de las colonias americanas respecto al Reino de Gran Bretaña.");
        return preguntaHistoria;
    }

    private Pregunta getPreguntaCiencia(){

        Pregunta preguntaCiencia = new Pregunta();
        preguntaCiencia.setCategory("Ciencia");
        preguntaCiencia.setQuestion("¿Quién propuso la teoría de la relatividad?");
        String[] options = new String[3];
        options[0] = "Albert Einstein";
        options[1] = "Isaac Newton";
        options[2] = "Stephen Hawking";
        preguntaCiencia.setOptions(options);
        preguntaCiencia.setAnswer(0);
        preguntaCiencia.setExplanation("La teoría de la relatividad fue propuesta por Albert Einstein, revolucionando nuestra comprensión del espacio, el tiempo y la gravedad.");
        return preguntaCiencia;
    }
}
