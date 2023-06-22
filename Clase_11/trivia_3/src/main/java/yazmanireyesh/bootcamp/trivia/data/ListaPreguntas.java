package yazmanireyesh.bootcamp.trivia.data;

import yazmanireyesh.bootcamp.trivia.entities.Pregunta;

import java.util.ArrayList;
import java.util.List;

public class ListaPreguntas {
    public static List<Pregunta> getQuestionList(){

        Pregunta q1 = new Pregunta();
        q1.setCategory("Cultura");
        q1.setQuestion("¿En qué país se encuentra la famosa obra de Leonardo da Vinci, La Mona Lisa?");
        q1.setOptions(new String[]{"Italia", "Francia", "España"});
        q1.setAnswer(1);
        q1.setExplanation("La Mona Lisa se encuentra en el Museo del Louvre en París, Francia.");

        Pregunta q2 = new Pregunta();
        q2.setCategory("Deportes");
        q2.setQuestion("¿En qué deporte se utiliza un bate y una pelota?");
        q2.setOptions(new String[]{"Fútbol", "Béisbol", "Tenis"});
        q2.setAnswer(1);
        q2.setExplanation("El béisbol es el deporte en el que se utiliza un bate y una pelota.");

        Pregunta q3 = new Pregunta();
        q3.setCategory("Arte");
        q3.setQuestion("¿Quién pintó la famosa obra 'La noche estrellada'?");
        q3.setOptions(new String[]{"Pablo Picasso", "Vincent van Gogh", "Leonardo da Vinci"});
        q3.setAnswer(1);
        q3.setExplanation("'La noche estrellada' fue pintada por Vincent van Gogh.");

        Pregunta q4 = new Pregunta();
        q4.setCategory("Cine");
        q4.setQuestion("¿Cuál de las siguientes películas fue dirigida por Steven Spielberg?");
        q4.setOptions(new String[]{"Pulp Fiction", "El Padrino", "Jurassic Park"});
        q4.setAnswer(2);
        q4.setExplanation("La película 'Jurassic Park' fue dirigida por Steven Spielberg.");

        Pregunta q5 = new Pregunta();
        q5.setCategory("Historia");
        q5.setQuestion("¿En qué año tuvo lugar la Revolución Francesa?");
        q5.setOptions(new String[]{"1789", "1812", "1848"});
        q5.setAnswer(0);
        q5.setExplanation("La Revolución Francesa tuvo lugar en el año 1789.");

        Pregunta q6 = new Pregunta();
        q6.setCategory("Ciencia");
        q6.setQuestion("¿Cuál es la ley fundamental de la electricidad?");
        q6.setOptions(new String[]{"Ley de Ohm", "Ley de Newton", "Ley de la Gravitación Universal"});
        q6.setAnswer(0);
        q6.setExplanation("La ley fundamental de la electricidad es la Ley de Ohm.");


        Pregunta q7 = new Pregunta();
        q7.setCategory("Cultura");
        q7.setQuestion("¿Cuál es la capital de Australia?");
        q7.setOptions(new String[]{"Sídney", "Melbourne", "Canberra"});
        q7.setAnswer(2);
        q7.setExplanation("La capital de Australia es Canberra.");

        Pregunta q8 = new Pregunta();
        q8.setCategory("Deportes");
        q8.setQuestion("¿En qué país se originó el deporte del judo?");
        q8.setOptions(new String[]{"Japón", "China", "Brasil"});
        q8.setAnswer(0);
        q8.setExplanation("El judo se originó en Japón.");

        Pregunta q9 = new Pregunta();
        q9.setCategory("Arte");
        q9.setQuestion("¿Cuál de los siguientes artistas es conocido por sus esculturas 'El Pensador' y 'El Beso'?");
        q9.setOptions(new String[]{"Auguste Rodin", "Michelangelo", "Pablo Picasso"});
        q9.setAnswer(0);
        q9.setExplanation("Las esculturas 'El Pensador' y 'El Beso' son obras de Auguste Rodin.");

        Pregunta q10 = new Pregunta();
        q10.setCategory("Cine");
        q10.setQuestion("¿Qué actor interpretó el papel de Iron Man en el Universo Cinematográfico de Marvel?");
        q10.setOptions(new String[]{"Chris Evans", "Robert Downey Jr.", "Tom Hiddleston"});
        q10.setAnswer(1);
        q10.setExplanation("Robert Downey Jr. interpretó el papel de Iron Man en el Universo Cinematográfico de Marvel.");

        Pregunta q11 = new Pregunta();
        q11.setCategory("Historia");
        q11.setQuestion("¿Quién fue el primer presidente de los Estados Unidos?");
        q11.setOptions(new String[]{"George Washington", "Thomas Jefferson", "Abraham Lincoln"});
        q11.setAnswer(0);
        q11.setExplanation("George Washington fue el primer presidente de los Estados Unidos.");

        Pregunta q12 = new Pregunta();
        q12.setCategory("Ciencia");
        q12.setQuestion("¿Cuál es el elemento químico más abundante en la Tierra?");
        q12.setOptions(new String[]{"Hierro", "Oxígeno", "Carbono"});
        q12.setAnswer(1);
        q12.setExplanation("El elemento químico más abundante en la Tierra es el oxígeno.");


        Pregunta q13 = new Pregunta();
        q13.setCategory("Cultura");
        q13.setQuestion("¿Quién escribió la famosa novela 'Don Quijote de la Mancha'?");
        q13.setOptions(new String[]{"Miguel de Cervantes", "Federico García Lorca", "Gabriel García Márquez"});
        q13.setAnswer(0);
        q13.setExplanation("La novela 'Don Quijote de la Mancha' fue escrita por Miguel de Cervantes.");

        Pregunta q14 = new Pregunta();
        q14.setCategory("Deportes");
        q14.setQuestion("¿Cuál es el evento deportivo más importante a nivel mundial en el fútbol?");
        q14.setOptions(new String[]{"Copa del Mundo", "Copa América", "Eurocopa"});
        q14.setAnswer(0);
        q14.setExplanation("La Copa del Mundo es el evento deportivo más importante a nivel mundial en el fútbol.");

        Pregunta q15 = new Pregunta();
        q15.setCategory("Arte");
        q15.setQuestion("¿Cuál de las siguientes obras literarias fue escrita por William Shakespeare?");
        q15.setOptions(new String[]{"1984", "Hamlet", "Don Quijote de la Mancha"});
        q15.setAnswer(1);
        q15.setExplanation("La obra 'Hamlet' fue escrita por William Shakespeare.");

        Pregunta q16 = new Pregunta();
        q16.setCategory("Cine");
        q16.setQuestion("¿Quién ganó el Premio de la Academia al Mejor Director por la película 'La forma del agua'?");
        q16.setOptions(new String[]{"Christopher Nolan", "Guillermo del Toro", "Martin Scorsese"});
        q16.setAnswer(1);
        q16.setExplanation("Guillermo del Toro ganó el Premio de la Academia al Mejor Director por la película 'La forma del agua'.");

        Pregunta q17 = new Pregunta();
        q17.setCategory("Historia");
        q17.setQuestion("¿Cuál fue la civilización que construyó las famosas pirámides de Egipto?");
        q17.setOptions(new String[]{"Mayas", "Egipcios", "Romanos"});
        q17.setAnswer(1);
        q17.setExplanation("Los egipcios fueron la civilización que construyó las famosas pirámides de Egipto.");

        Pregunta q18 = new Pregunta();
        q18.setCategory("Ciencia");
        q18.setQuestion("¿Cuál es la teoría científica aceptada que explica el origen del universo?");
        q18.setOptions(new String[]{"Teoría de la Relatividad", "Teoría del Big Bang", "Teoría de la Evolución"});
        q18.setAnswer(1);
        q18.setExplanation("La teoría científica aceptada que explica el origen del universo es la Teoría del Big Bang.");

        List<Pregunta> listaPreguntas = new ArrayList<>();
        listaPreguntas.add(q1);
        listaPreguntas.add(q2);
        listaPreguntas.add(q3);
        listaPreguntas.add(q4);
        listaPreguntas.add(q5);
        listaPreguntas.add(q6);
        listaPreguntas.add(q7);
        listaPreguntas.add(q8);
        listaPreguntas.add(q9);
        listaPreguntas.add(q10);
        listaPreguntas.add(q11);
        listaPreguntas.add(q12);
        listaPreguntas.add(q13);
        listaPreguntas.add(q14);
        listaPreguntas.add(q15);
        listaPreguntas.add(q16);
        listaPreguntas.add(q17);
        listaPreguntas.add(q18);

        return listaPreguntas;
    }
}
