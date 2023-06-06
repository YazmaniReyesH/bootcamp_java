package Clase_5;

import java.util.Scanner;

public class Calculadora_Descuento {
    public static void main(String[] args) {
        double precioFinal = 0;

        Scanner ingresaPrecioOriginal = new Scanner(System.in);
        System.out.println("Ingresa el precio original del producto: ");
        double precioOriginal = ingresaPrecioOriginal.nextInt();

        Scanner ingresaDescuento = new Scanner(System.in);
        System.out.println("Ingresa el porcentaje de descuento: ");
        double descuento = ingresaDescuento.nextInt();

        if (precioOriginal <= 0) {
            System.out.println("El precio debe ser un número positivo.");
        } else if (descuento <= 0){
            System.out.println("El descuento debe ser un número positivo.");
        } else {
            precioFinal = precioOriginal - (precioOriginal * descuento / 100);
            System.out.println("El precio final es: " + precioFinal);
        }
    }
}
