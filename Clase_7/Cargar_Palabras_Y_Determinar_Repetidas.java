package Clase_7;

import java.util.Scanner;

public class Cargar_Palabras_Y_Determinar_Repetidas {
    public static void main(String[] args) {
        //que le pida al usuario 15 palabras y que muestre esas palabras e indique cuantas veces se repitió cada
        //una y ademas que diga como conclusion cual fue la palabra que mas se repitió.

        Scanner IngresePalabras = new Scanner(System.in);
        String[] palabras = new String[15];

        for(int i = 0; i < palabras.length; i++){
            System.out.print("Ingrese una palabra ["+ i + "]: ");
            palabras[i] = IngresePalabras.next();
        }

        int[] contador = new int[palabras.length];

        for (int i = 0; i < palabras.length; i++) {
            contador[i] = 1;
            for (int j = i + 1; j < palabras.length; j++) {
                if (palabras[i].equals(palabras[j])) {
                    contador[i]++;
                    palabras[j] = ""; // Marcar palabra repetida como vacía para ir descartando palabras
                }
            }
        }

        int maxFrecuencia = 0;
        String palabraMasRepetida = "";
        for (int i = 0; i < palabras.length; i++) {
            if (!palabras[i].equals("")) {
                System.out.println("Palabra: " + palabras[i] + ", Repeticiones: " + contador[i]);
                if (contador[i] > maxFrecuencia) {
                    maxFrecuencia = contador[i];
                    palabraMasRepetida = palabras[i];
                }
            }
        }
        System.out.println("La palabra que más se repite es: " + palabraMasRepetida);
    }
}
