import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainAlumno {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Alumno> alumnos = new ArrayList<>();
        //Alumno alumno = new Alumno();
        String respuesta = "S";

        do {
            alumnos.add(agregarAlumno());
            //alumnos.add(alumno.agregarAlumno());
            System.out.println("Agregar nuevo alumno? S/N");
            respuesta = scanner.next();
        }while(respuesta.equalsIgnoreCase("S"));

        for(Alumno alum : alumnos){
            System.out.println(alum.datosDelAlumno());
        }
    }

    public static Alumno agregarAlumno(){
        Scanner scanner = new Scanner(System.in);

        Alumno alumno = new Alumno();
        System.out.println("************* Registro de Alumno *************");
        System.out.print("Nombre: ");
        alumno.setNombre(scanner.nextLine());
        System.out.print("Apellido: ");
        alumno.setApellido(scanner.nextLine());
        System.out.print("e-mail: ");
        alumno.setEmail(scanner.nextLine());
        System.out.print("Teléfono: ");
        alumno.setTelefono(scanner.nextLine());

        System.out.println("********** Calificaciones del Alumno **********");
        float[] calificaciones = new float[5];
        float sumaCalificaciones = 0;
        float promedio = 0;

        System.out.println("Ingresa las 5 Notas");

        for(int i = 0; i < calificaciones.length; i++){
            System.out.print("Nota " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextInt();
            sumaCalificaciones += calificaciones[i];
            promedio = (sumaCalificaciones/calificaciones.length);
        }
        alumno.setCalificaciones(calificaciones);
        alumno.setPromedio(promedio);

        return alumno;
    }
}
