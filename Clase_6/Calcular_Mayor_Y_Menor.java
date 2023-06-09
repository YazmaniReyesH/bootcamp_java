package Clase_6;

import java.util.Scanner;

public class Calcular_Mayor_Y_Menor {
    public static void main(String[] args) {
        //Armar un programa que permita cargar 3 números y mostrar cual es el mayor y cual es el menor.

        Scanner ingresaNumeros = new Scanner(System.in);

        System.out.println("Ingresa el primer número: ");
        double numero1 = ingresaNumeros.nextDouble();

        System.out.println("Ingresa el segundo número: ");
        double numero2 = ingresaNumeros.nextDouble();

        System.out.println("Ingresa el tercer número: ");
        double numero3 = ingresaNumeros.nextDouble();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("El numero mayor es: " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3){
            System.out.println("El numero mayor es: " + numero2);
        } else if (numero3 > numero1 && numero3 > numero2){
            System.out.println("El numero mayor es: " + numero3);
        }

        if (numero1 < numero2 && numero1 < numero3){
            System.out.println("El numero menor es: " + numero1);
        } else if (numero2 < numero1 && numero2 < numero3){
            System.out.println("El numero menor es: " + numero2);
        } else if (numero3 < numero1 && numero3 < numero2){
            System.out.println("El numero menor es: " + numero3);
        }
    }
}
