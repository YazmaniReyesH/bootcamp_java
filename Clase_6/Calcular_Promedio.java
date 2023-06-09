package Clase_6;

import java.util.Scanner;

public class Calcular_Promedio {
    public static void main(String[] args) {
        //Armar un programa que permita cargar 3 números y mostrar cual es el número promedio

        Scanner ingresaNumeros = new Scanner(System.in);

        System.out.println("Ingresa el primer número: ");
        double numero1 = ingresaNumeros.nextDouble();

        System.out.println("Ingresa el segundo número: ");
        double numero2 = ingresaNumeros.nextDouble();

        System.out.println("Ingresa el tercer número: ");
        double numero3 = ingresaNumeros.nextDouble();

        double promedio = (numero1 + numero2 + numero3) / 3;
        System.out.println("El promedio de los números ingresados es: " + promedio);
    }
}
