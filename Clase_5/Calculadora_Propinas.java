package Clase_5;

import java.util.Scanner;

public class Calculadora_Propinas {
    public static void main(String[] args) {
        double montoPropina = 0;

        Scanner ingresaCuenta = new Scanner(System.in);
        System.out.println("Ingresa el total de la cuenta: ");
        double totalCuenta = ingresaCuenta.nextInt();

        Scanner ingresaPropina = new Scanner(System.in);
        System.out.println("Ingresa el porcentaje de propina que deseas dejar: ");
        double porcentajePropina = ingresaPropina.nextInt();

        if (totalCuenta <= 0) {
            System.out.println("El monto de la cuenta debe ser un número positivo.");
        } else if (porcentajePropina <= 0){
            System.out.println("El porcentaje de la propina debe ser un número positivo.");
        } else {
            montoPropina = totalCuenta * (porcentajePropina / 100);
            System.out.println("El monto de la propina es: " + montoPropina);
        }
    }
}
