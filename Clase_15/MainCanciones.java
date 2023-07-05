import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCanciones {
    static Scanner teclado = new Scanner(System.in);
    static Canciones[] canciones = new Canciones[5];
    static List<Canciones> playList = new ArrayList<>();
    static int pistaActual = 0;

    public static void main(String[] args){
        canciones[0] = new Canciones(1, "Sweet Child o' Mine", "Guns N' Roses", "Rock", "5:56");
        canciones[1] = new Canciones(2, "Livin' on a Prayer", "Bon Jovi", "Rock", "4:09");
        canciones[2] = new Canciones(3, "Back in Black", "AC/DC", "Rock", "4:15");
        canciones[3] = new Canciones(4, "Don't Stop Believin", "Journey", "Rock", "4:10");
        canciones[4] = new Canciones(5, "The Final Countdown", "Europe", "Rock", "5:09");
        mostrarMenu();
    }

    private static void mostrarMenu(){
        //Scanner teclado = new Scanner(System.in);
        System.out.println("*************** SPOTIFY ***************");
        System.out.println("1. Mostrar Canciones Disponibles");
        System.out.println("2. Administrar mi PlayList");
        System.out.println("3. Mostrar mi PlayList");
        System.out.println("4. Reproducir mi PlayList");
        System.out.println("5. Salir");

        System.out.print("Selecciona una opcion: ");
        int respuesta = teclado.nextInt();
        if(respuesta == 1) listarCanciones();
        if(respuesta == 2) mostrarMenuPlaylist();
        if(respuesta == 3) mostrarPlaylist();
        if(respuesta == 4) reproducirPlaylist(pistaActual);
        if(respuesta == 5) System.exit(0);
    }

    private static void listarCanciones(){
        //Canciones[] canciones = new Canciones[5];
        System.out.println();
        System.out.println("*************** CANCIONES DISPONIBLES ***************");
        for(Canciones cancion : canciones){
            System.out.println(cancion.mostrarInformacionCancion());
        }
        System.out.println();
        mostrarMenu();
    }

    private static void mostrarMenuPlaylist(){
        System.out.println();
        System.out.println("******* ADMINISTRAR MI PLAYLIST *******");

        System.out.println("1. Mostrar Canciones Disponibles");
        System.out.println("2. Agregar Canción");
        System.out.println("3. Eliminar Canción");
        System.out.println("4. Ver Mi PlayList");
        System.out.println("5. Reproducir Playlist");
        System.out.println("6. Regresar al Menú Principal");
        System.out.print("Selecciona una opcion: ");
        int respuesta = teclado.nextInt();

        if (respuesta == 1) listarCanciones();
        if (respuesta == 2) agregarCancion();
        if (respuesta == 3) eliminarCancion();
        if (respuesta == 4) mostrarPlaylist();
        if (respuesta == 5) reproducirPlaylist(pistaActual);
        if (respuesta == 6) System.out.println(); mostrarMenu();
    }

    private static void agregarCancion(){
        System.out.println();
        System.out.println("******* AGREGAR UNA CANCIÓN A LA PLAYLIST *******");
        System.out.print("Id de la canción que quieres agregar: ");
        int id = teclado.nextInt();

        if(id <= canciones.length && id > 0){
            if(playList.contains(canciones[id - 1])){
                System.out.println("Esta canción ya existe en la PlayList");
            } else {
                playList.add(canciones[id - 1]);
                System.out.println("Canción Agregada");
            }
        } else {
            System.out.println("No se encontraron resultados");
        }
        mostrarMenuPlaylist();
    }

    private static void eliminarCancion(){
        System.out.println();
        System.out.println("******* ELIMINAR CANCIÓN DE LA PLAYLIST *******");
        System.out.print("Id de canción que quieres eliminar: ");
        int id = teclado.nextInt();

        if(playList.contains(canciones[id - 1])){
            playList.remove(canciones[id - 1]);
            System.out.println("Canción Eliminada");
        }else{
            System.out.println("No se encontraron resultados");
        }
        mostrarMenuPlaylist();
    }

    private static void mostrarPlaylist(){
        System.out.println();
        System.out.println("*************** MI PLAYLIST ***************");
        if (playList.isEmpty()) System.out.println("PlayList Vacía");

        for(Canciones cancion : playList){
            System.out.println(cancion.mostrarInformacionCancion());
        }
        System.out.println();
        mostrarMenu();
    }

    private static void reproducirPlaylist(int reproduciendo){
        System.out.println();
        System.out.println("*************** REPRODUCIR PLAYLIST ***************");

        if (playList.isEmpty()) {
            System.out.println("PlayList Vacía");
            System.out.println();
            mostrarMenu();
        }
        else {
            //System.out.println("Cual es el Id de la cancion que quieres reproducir?");
            //int reproduciendo = teclado.nextInt();
            System.out.println("Reproduciendo " + playList.get(reproduciendo).mostrarInformacionCancion());
            mostrarMenuReproductor();
        }
    }

    private static void mostrarMenuReproductor() {
        System.out.println();
        System.out.println("1. Anterior");
        System.out.println("2. Siguiente");
        System.out.println("3. Detener Reproducción");
        System.out.print("Selecciona una opcion: ");
        int respuesta = teclado.nextInt();

        if(respuesta == 1) reproducirAnterior();
        if(respuesta == 2) reproducirSiguiente();
        if(respuesta == 3) pistaActual = 0; System.out.println(); mostrarMenu();
    }

    private static void reproducirAnterior(){
        if (pistaActual - 1 >= 0){
            pistaActual--;
            reproducirPlaylist(pistaActual);
        } else {
            System.out.println("Esta es la primera canción de la PlayList");
            reproducirPlaylist(pistaActual);
        }
        mostrarMenuReproductor();
    }

    private static void reproducirSiguiente(){
      if (pistaActual + 1 < playList.size()){
            pistaActual++;
            reproducirPlaylist(pistaActual);
        }else{
            System.out.println("Esta es la última canción de la PlayList");
            reproducirPlaylist(pistaActual);
        }
        mostrarMenuReproductor();
    }
}
