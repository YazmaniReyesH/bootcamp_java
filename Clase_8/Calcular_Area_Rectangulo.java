package Clase_8;

import java.util.Scanner;
public class Calcular_Area_Rectangulo {
    public static void main (String[] args) {
        //Hacer una función que calcule el área de un cuadrado. Al llamarla debe devolver el área del rectangulo.
        System.out.println("El área del rectangulo es: " + getAreaCuadrado());
    }
    public static float getAreaCuadrado () {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa el ancho: ");
        float ancho = leer.nextInt();
        System.out.println("ingresa el alto: ");
        float alto = leer.nextInt();
        return ancho * alto;
    }
}
