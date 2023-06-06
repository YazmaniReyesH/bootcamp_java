package Clase_5;

import java.util.Scanner;

public class Juego_Adivina_Numero {
    public static void main(String[] args) {
        double numeroSistema = Math.floor(Math.random() * 100);

        Scanner ingresaNumero = new Scanner(System.in);
        System.out.println("Ingresa el numero que crees que generó el sistema: ");
        double numeroUsuario = ingresaNumero.nextInt();

        if (numeroUsuario <= 0) {
            System.out.println("El numero debe ser un número positivo.");
        } else if (numeroUsuario == numeroSistema){
            System.out.println("Felicidades, acertaste!!!");
        } else {
            System.out.println("Suerte para la próxima, el número correcto es: " + numeroSistema);
        }
    }
}
