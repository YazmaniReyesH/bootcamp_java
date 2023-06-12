package Clase_7;

import java.util.Scanner;

public class Ingresar_Numeros_Y_Mostralos {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner ingresaNumero = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa un número: ");
            //int numero = ingresaNumero.nextInt();
            numeros[i] = ingresaNumero.nextInt();
        }

        /*int i = 0;
        do {
            System.out.println("Ingresa un número: ");
            int numero = ingresaNumero.nextInt();
            numeros[i] = numero;
            i++;
        } while(i < numeros.length);*/

        /*int i = 0;
        while (i < numeros.length) {
            System.out.println("Ingresa un número: ");
            int numero = ingresaNumero.nextInt();
            numeros[i] = numero;
            i++;
        }*/

        System.out.println("Los números que ingresaste son: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        /*i=0;
        do {
            System.out.println(numeros[i]);
            i++;
        } while(i < numeros.length);*/

        /*i=0;
        while (i < numeros.length) {
            System.out.println(numeros[i]);
            i++;
        }*/
    }
}
