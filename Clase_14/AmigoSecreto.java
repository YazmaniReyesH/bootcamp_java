import java.util.Scanner;

public class AmigoSecreto {
    public static void main(String[] args){
        jugarAlAmigoSecreto();
    }

    private static void jugarAlAmigoSecreto() {
        System.out.println("¿Cuántas personas van a jugar al Amigo Secreto?");
        Scanner teclado = new Scanner(System.in);
        int cantidadPersonas = teclado.nextInt();

        String[] listaDeNombres = new String[cantidadPersonas];
        ingresarNombresDeJugadores(teclado, cantidadPersonas, listaDeNombres);

        String[] afortunados = new String[cantidadPersonas];
        asignarAfortunadosAPersonas(cantidadPersonas, listaDeNombres, afortunados);

        mostrarAfortunadosAJugadores(teclado, cantidadPersonas, listaDeNombres, afortunados);
    }

    private static void mostrarAfortunadosAJugadores(Scanner teclado, int cantidadPersonas, String[] listaDeNombres, String[] afortunados) {
        for (int i = 0; i < cantidadPersonas; i++){
            String nombreDeLaPersona = listaDeNombres[i];
            System.out.println("Que " + nombreDeLaPersona + " se acerque a la computadora y escriba LISTO para continuar");
            teclado.next();
            String nombreDelAfortunado = afortunados[i];
            System.out.println("Le tienes que hacer un regalo a " + nombreDelAfortunado + ". Escribe LISTO para continuar");
            teclado.next();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
    }

    private static void asignarAfortunadosAPersonas(int cantidadPersonas, String[] listaDeNombres, String[] afortunados) {
        for (int i = 0; i < cantidadPersonas; i++){
            int indice = i + 1;
            if (indice >= cantidadPersonas){
                indice = 0;
            }
            afortunados[i] = listaDeNombres[indice];
        }
    }

    private static void ingresarNombresDeJugadores(Scanner teclado, int cantidadPersonas, String[] listaDeNombres) {
        for (int i = 0; i < cantidadPersonas; i++){
            System.out.println("Ingrese el nombre de una persona:");
            String nombreDeLaPersona = teclado.next();
            listaDeNombres[i] = nombreDeLaPersona;
        }
        /*
        int contador = 0;
        while(contador < cantidadPersonas){
            System.out.println("Ingrese el nombre de una persona:");
            String nombreDeLaPersona = teclado.next();
            lista[contador] = nombreDeLaPersona;
            contador++;
        }

        int contador = 0;
        do{
            System.out.println("Ingrese el nombre de una persona:");
            String nombreDeLaPersona = teclado.next();
            lista[contador] = nombreDeLaPersona;
            contador++;
        } while(contador < cantidadPersonas);
        */
    }
}
