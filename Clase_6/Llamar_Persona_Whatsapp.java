package Clase_6;

import java.util.Scanner;

public class Llamar_Persona_Whatsapp {
    public static void main(String[] args) {
        //Llamar a una persona por Whatsapp
        Scanner ingresaTelefono = new Scanner(System.in);
        System.out.println("Ingresa el numero de telefono sin espacios: ");
        String telefono = ingresaTelefono.next();
        System.out.println("https://api.whatsapp.com/send?phone=" + telefono);
    }
}
