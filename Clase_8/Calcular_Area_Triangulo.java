package Clase_8;

import java.util.Scanner;

public class Calcular_Area_Triangulo {
    public static void main (String[] args) {
        //Hacer una función que calcule el área de un triangulo. Al llamarla debe devolver el área del triangulo.
        System.out.println("El área del Triangulo es: " + getAreaTriangulo());
    }
    public static float getAreaTriangulo () {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa la base: ");
        float base = leer.nextInt();
        System.out.println("ingresa el altura: ");
        float altura = leer.nextInt();
        return ((base * altura)/2);
    }
}
