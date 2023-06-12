package Clase_7;

import java.util.Scanner;

public class Ingresar_Numeros_Y_Mostralos {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner ingresaNumero = new Scanner(System.in);

        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.println("Ingresa un número: ");
            //int numero = ingresaNumero.nextInt();
            numeros[contador] = ingresaNumero.nextInt();
        }

        /*int contador = 0;
        do {
            System.out.println("Ingresa un número: ");
            int numero = ingresaNumero.nextInt();
            numeros[contador] = numero;
            contador++;
        } while(contador < numeros.length);*/

        /*int contador = 0;
        while (contador < numeros.length) {
            System.out.println("Ingresa un número: ");
            int numero = ingresaNumero.nextInt();
            numeros[contador] = numero;
            contador++;
        }*/

        System.out.println("Los números que ingresaste son: ");

        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.println(numeros[contador]);
        }

        /*contador=0;
        do {
            System.out.println(numeros[contador]);
            contador++;
        } while(contador < numeros.length);*/

        /*contador=0;
        while (contador < numeros.length) {
            System.out.println(numeros[contador]);
            contador++;
        }*/
    }
}
