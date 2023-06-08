package Clase_6;

import java.util.Scanner;

public class Buscador_Paises_GoogleMaps {
    public static void main(String[] args) {
        //Buscador de países con Google Maps
        Scanner ingresaPais = new Scanner(System.in);
        System.out.println("Ingresa el pais: ");
        String pais = ingresaPais.next();
        System.out.println("https://www.google.com/maps/search/" + pais);
    }
}
