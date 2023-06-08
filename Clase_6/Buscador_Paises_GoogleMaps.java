package Clase_6;

import java.util.Scanner;

public class Buscador_Paises_GoogleMaps {
    public static void main(String[] args) {
        //Buscador de Tweets para Twitter.com
        Scanner ingresaCelebridad = new Scanner(System.in);
        System.out.println("Ingresa el nombre de una celebridad (una sola palabra): ");
        String celebridad = ingresaCelebridad.next();
        System.out.println("https://twitter.com/search?q=" + celebridad);
    }
}
