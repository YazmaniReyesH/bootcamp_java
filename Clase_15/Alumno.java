import java.util.Arrays;
import java.util.Scanner;

public class Alumno {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private float[] calificaciones;
    private float promedio;

    public Alumno(){

    }

    public Alumno(String nombre, String apellido, String email, String telefono, float[] calificaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.calificaciones = calificaciones;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public float[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(float[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    /*
    public Alumno agregarAlumno(){
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
        calificaciones = new float[5];
        float sumaCalificaciones = 0;
        promedio = 0;

        System.out.println("Ingresa las 5 Calificaciones");

        for(int i = 0; i < calificaciones.length; i++){
            System.out.print("Calificacion " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextInt();
            sumaCalificaciones += calificaciones[i];
            promedio = (sumaCalificaciones/calificaciones.length);
        }
        alumno.setCalificaciones(calificaciones);
        alumno.setPromedio(promedio);

        return alumno;
    }
    */

    public String datosDelAlumno() {
        return "**************************************" + "\n" +
                "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Email: " + email + "\n" +
                "Telefono: " + telefono + "\n" +
                "Calificaciones: " + Arrays.toString(calificaciones) + "\n" +
                "Promedio: " + promedio + "\n" +
                "**************************************";
    }
}
