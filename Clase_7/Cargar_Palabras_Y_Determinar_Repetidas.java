package Clase_7;

import java.util.Scanner;

public class Cargar_Palabras_Y_Determinar_Repetidas {
    public static void main(String[] args) {
        //que le pida al usuario 15 palabras y que muestre esas palabras e indique cuantas veces se repitió cada
        //una y ademas que diga como conclusion cual fue la palabra que mas se repitió.

        Scanner teclado = new Scanner(System.in);
        String[] array = new String[15];

        for(int i = 0; i < array.length; i++){
            System.out.print("Ingrese una palabra ["+ i + "]: ");
            array[i] = teclado.next();
        }

        int[] contador = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            contador[i] = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    contador[i]++;
                    array[j] = ""; // Marcar palabra repetida como vacía
                }
            }
        }

        int maxFrecuencia = 0;
        String palabraMasRepetida = "";
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals("")) {
                System.out.println("Palabra: " + array[i] + ", Repeticiones: " + contador[i]);
                if (contador[i] > maxFrecuencia) {
                    maxFrecuencia = contador[i];
                    palabraMasRepetida = array[i];
                }
            }
        }
        System.out.println("La palabra que más se repite es: " + palabraMasRepetida);
    }
}
