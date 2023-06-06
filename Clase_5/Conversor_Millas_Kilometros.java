package Clase_5;

import java.util.Scanner;

public class Conversor_Millas_Kilometros {
    public static void main(String[] args) {
        double kilometros = 0;
        Scanner ingresaMillas = new Scanner(System.in);

        System.out.println("Ingresa la distancia en Millas:");
        double millas = ingresaMillas.nextInt();

        if (millas <= 0) {
            System.out.println("Las Millas deben ser un número positivo.");
        } else {
            kilometros = millas * 1.60934;
            System.out.println("La distancia en kilómetros es: " + kilometros);
        }
    }
}
