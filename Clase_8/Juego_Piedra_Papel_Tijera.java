package Clase_8;

import java.util.Random;
import java.util.Scanner;
public class Juego_Piedra_Papel_Tijera {
    public static void main(String[] args) {
        jugarPiedraPapelTijeras();
    }
    public static void jugarPiedraPapelTijeras() {
        String[] opciones = {"piedra", "papel", "tijeras"};

        Scanner opcionUsuario = new Scanner(System.in);
        Random opcionComputadora = new Random();

        System.out.println("¡Bienvenido a Piedra, Papel, Tijeras!");

        boolean continuarJuego = true;
        while (continuarJuego) {
            System.out.println("Ingresa tu elección: piedra, papel o tijeras");
            String eleccionUsuario = opcionUsuario.nextLine().toLowerCase();

            // Validar la elección del usuario
            if (!validarEleccion(eleccionUsuario)) {
                System.out.println("Elección inválida. Inténtalo de nuevo.");
                continue;
            }

            // Generar elección aleatoria para la computadora
            int indiceComputadora = opcionComputadora.nextInt(3);
            String eleccionComputadora = opciones[indiceComputadora];

            System.out.println("La computadora eligió: " + eleccionComputadora);

            // Determinar el ganador
            String resultado = determinarGanador(eleccionUsuario, eleccionComputadora);
            System.out.println(resultado);

            // Preguntar si se desea jugar de nuevo
            System.out.println("¿Deseas jugar de nuevo? (s/n)");
            String respuesta = opcionUsuario.nextLine().toLowerCase();

            if (!respuesta.equals("s")) {
                continuarJuego = false;
            }
        }
    }
    public static boolean validarEleccion(String eleccion) {
        String[] opciones = {"piedra", "papel", "tijeras"};
        for (String opcion : opciones) {
            if (opcion.equals(eleccion)) {
                return true;
            }
        }
        return false;
    }
    public static String determinarGanador(String eleccionUsuario, String eleccionComputadora) {
        if (eleccionUsuario.equals(eleccionComputadora)) {
            return "¡Es un empate!";
        } else if ((eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijeras")) ||
                (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra")) ||
                (eleccionUsuario.equals("tijeras") && eleccionComputadora.equals("papel"))) {
            return "¡Ganaste!";
        } else {
            return "¡La computadora gana!";
        }
    }
}
