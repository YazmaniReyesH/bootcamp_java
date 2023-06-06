package Clase_5;

import java.util.Scanner;

public class Calculadora_Edad_Perros {
    public static void main(String[] args) {
        int edadPerro = 0;
        Scanner IngresaEdad = new Scanner(System.in);

        System.out.println("Ingresa la edad de tu perro en años humanos:");
        int edadHumana = IngresaEdad.nextInt();

        if (edadHumana <= 0) {
            System.out.println("La edad debe ser un número positivo.");
        } else {
            edadPerro = edadHumana * 7;
            System.out.println("La edad de tu perro en años de perro es: " + edadPerro);
        }
    }
}