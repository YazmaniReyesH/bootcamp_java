import java.util.Scanner;

public class Busqueda {
    public static void main(String[] args) {

        String[] personas = {"Lucas Moy","Aldo Angelini", "Julia Gomez", "Manuel Santillan", "Yazmani Reyes"};
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su busqueda:");
        String busqueda = teclado.nextLine();

        //Arrays.stream(personas).parallel().filter(nombre -> nombre.contains(busqueda));

        for (String nombrePersona : personas) {
            if (nombrePersona.toLowerCase().contains(busqueda.toLowerCase())) {
                System.out.println("La persona es: " + nombrePersona);
            }
        }

        /*
        for (String nombrePersona : personas) {
            if (busqueda.equalsIgnoreCase(nombrePersona)) {
                System.out.println("La persona es: " + nombrePersona);
            }
        }
        */

        /*
        for (int i = 0; i < personas.length; i++) {
            String personaEncontrada = personas[i];
            if (busqueda.equalsIgnoreCase(personaEncontrada)) {
                System.out.println("La persona es: " + personaEncontrada);
            }
        }
        */
    }
}
