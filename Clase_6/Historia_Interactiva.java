package Clase_6;

import java.util.Scanner;

public class Historia_Interactiva {
    public static void main(String[] args) {
        //Crear un programa que cuente una historia al estilo de “Elige tu propia Aventura”.
        //Los libros de “Elige tu propia aventura” eran historias interactivas, en el que el
        //lector en un momento podía elegir a qué página ir. El ejercicio consiste en hacer
        //un pequeño cuento de este estilo.

        Scanner ingresaOpcion = new Scanner(System.in);

        System.out.println(
                "Te encuentras frente a la famosa \"Casa del Terror\". Es una noche oscura y " +
                        "lluviosa. La casa está envuelta en sombras siniestras y escuchas risas " +
                        "malévolas provenientes del interior. Tienes tres opciones, ¿Qué haces?:\n" +
                        "1. Entras valientemente en la casa para descubrir los secretos que se esconden en su interior.\n" +
                        "2. Decides esperar afuera y observar la casa desde la distancia.\n" +
                        "3. Te das la vuelta y te alejas rápidamente.");
        int opcionCiclo1 = ingresaOpcion.nextInt();

        if (opcionCiclo1 == 1){
            System.out.println(
                    "Decides entrar valientemente en la casa. Al cruzar la puerta, las luces parpadean y una niebla " +
                            "espesa envuelve el lugar. Escuchas pasos detrás de ti. ¿Qué haces ahora?:\n" +
                            "1. Sigues adelante, explorando las habitaciones a pesar del miedo.\n" +
                            "2. Intentas regresar sobre tus pasos y salir de la casa.\n" +
                            "3. Gritas pidiendo ayuda.");
            int opcionCiclo2 = ingresaOpcion.nextInt();
            if (opcionCiclo2 == 1){
                System.out.println(
                        "Decides entrar valientemente en la casa. Al cruzar la puerta, las luces parpadean y una " +
                                "niebla espesa envuelve el lugar. Escuchas pasos detrás de ti. ¿Qué haces ahora?\n" +
                                "1. Sigues adelante, explorando las habitaciones a pesar del miedo.\n" +
                                "2. Intentas regresar sobre tus pasos y salir de la casa.\n" +
                                "3. Gritas pidiendo ayuda.");
            } else if (opcionCiclo2 == 2){
                System.out.println(
                        "Decides esperar afuera y observar la casa. De repente, una figura sombría se mueve por " +
                                "una ventana y desaparece. ¿Qué decides hacer ahora?\n" +
                                "1. Te armas de valor y entras en la casa para investigar.\n" +
                                "2. Decides llamar a la policía para informar sobre la extraña figura.\n" +
                                "3. Optas por irte del lugar, sintiendo que no es seguro.");
            }else if (opcionCiclo2 == 3){
                System.out.println(
                        "Decides dar la vuelta y alejarte rápidamente. Sin embargo, sientes que alguien o algo " +
                                "te sigue de cerca. ¿Cómo reaccionas?\n" +
                                "1. Corres tan rápido como puedes para alejarte de la presencia.\n" +
                                "2. Te detienes y tratas de enfrentar lo que sea que te siga.\n" +
                                "3. Buscas refugio en algún lugar cercano.");
            }
        } else if (opcionCiclo1 == 2){
            System.out.println(
                    "Decides esperar afuera y observar la casa. De repente, una figura sombría se mueve por una " +
                            "ventana y desaparece. ¿Qué decides hacer ahora?:\n" +
                            "1. Te armas de valor y entras en la casa para investigar.\n" +
                            "2. Decides llamar a la policía para informar sobre la extraña figura.\n" +
                            "3. Optas por irte del lugar, sintiendo que no es seguro.");
        } else if (opcionCiclo1 == 3){
            System.out.println(
                    "Decides dar la vuelta y alejarte rápidamente. Sin embargo, sientes que alguien o algo te " +
                            "sigue de cerca. ¿Cómo reaccionas?:\n" +
                            "1. Corres tan rápido como puedes para alejarte de la presencia.\n" +
                            "2. Te detienes y tratas de enfrentar lo que sea que te siga.\n" +
                            "3. Buscas refugio en algún lugar cercano.");
        }
    }
}
