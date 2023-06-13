package Clase_7;

import java.util.Scanner;

public class Obtener_Promedio {
    public static void main(String[] args) {
        //Hacer un programa que permita al usuario ingresar 5 números, mostrarlos, que muestre el número
        // mayor y el número menor y que muestre el promedio.
        int[] numeros = new int[5];
        Scanner ingresaNumero = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa un número: ");
            //int numero = ingresaNumero.nextInt();
            numeros[i] = ingresaNumero.nextInt();
        }

        System.out.println("Los números que ingresaste son: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        int mayor = 0;
        int menor = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= mayor || i == 0) {
                mayor = numeros[i];
            }
            if (numeros[i] <= menor || i == 0) {
                menor = numeros[i];
            }
        }
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);

        int sumatoria = 0;
        for(int i = 0; i < numeros.length; i++) {
            sumatoria += numeros[i];
        }
        System.out.println("La sumatoria es: " + sumatoria);
        float promedio = (float)sumatoria / numeros.length;
        System.out.println("El promedio es: " + promedio);
    }
}
