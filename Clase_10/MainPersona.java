import java.time.LocalDate;

public class MainPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona(1, "Yazmani Reyes",34, LocalDate.of(1988,11,21),"2023-1988");
        persona1.mostrar();
        //persona1.esMayorDeEdad();
        //System.out.println(persona1.esMayorDeEdad());

        Persona persona2 = new Persona(2, "Juan Lopez",15, LocalDate.of(2008,05,15),"2023-2008");
        persona2.mostrar();
    }
}
