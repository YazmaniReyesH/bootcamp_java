import java.time.LocalDate;

public class Persona {
    private int id;
    private String nombre;
    private int edad;
    private LocalDate fechaNacimiento;
    private String dni;

    public Persona(){

    }

    public Persona(int id, String nombre, int edad, LocalDate fechaNacimiento, String dni){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void mostrar(){
        System.out.println("Los datos de " + nombre + " son:\n"
                + "Nombre: " + nombre + "\n"
                + "Edad:" + edad + "\n"
                + "Fecha de Nacimiento: " + fechaNacimiento + "\n"
                + "DNI: " + dni + "\n"
                + "Es mayor de edad?: " + (esMayorDeEdad() ? "Si":"No") + "\n");
        //System.out.println(esMayorDeEdad());
    }

    public Boolean esMayorDeEdad(){
        //return (edad >= 18 ? "Es mayor de edad" : "No es mayor de edad");
        return edad >= 18;
    }
}
