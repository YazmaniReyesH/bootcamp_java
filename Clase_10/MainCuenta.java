import java.time.LocalDate;

public class MainCuenta {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.ingresar();
        cuenta.mostrar();

        cuenta.retirar();
        cuenta.mostrar();
    }
}
