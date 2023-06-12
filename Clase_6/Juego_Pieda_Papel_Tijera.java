package Clase_6;

import java.util.Random;
import java.util.Scanner;

public class Juego_Pieda_Papel_Tijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bienvenido al juego Piedra, Papel, Tijeras");
        System.out.println("Ingrese su elección: piedra, papel o tijeras");
        String eleccionUsuario = scanner.nextLine();

        // Generar elección aleatoria para la computadora
        String[] opciones = {"piedra", "papel", "tijeras"};
        int indiceAleatorio = random.nextInt(opciones.length);
        String eleccionComputadora = opciones[indiceAleatorio];

        System.out.println("La elección de la computadora es: " + eleccionComputadora);

        // Determinar el ganador
        if (eleccionUsuario.equalsIgnoreCase(eleccionComputadora)) {
            System.out.println("Empate");
        } else if ((eleccionUsuario.equalsIgnoreCase("piedra") && eleccionComputadora.equalsIgnoreCase("tijeras"))
                || (eleccionUsuario.equalsIgnoreCase("papel") && eleccionComputadora.equalsIgnoreCase("piedra"))
                || (eleccionUsuario.equalsIgnoreCase("tijeras") && eleccionComputadora.equalsIgnoreCase("papel"))) {
            System.out.println("¡Ganaste! Felicidades");
        } else {
            System.out.println("¡Perdiste! Mejor suerte la próxima vez");
        }

        scanner.close();
    }
}
