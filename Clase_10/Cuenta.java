import java.time.LocalDate;
import java.util.Scanner;

public class Cuenta {
    private String titular;
    private float cantidad;

    public Cuenta(){

    }

    public Cuenta(String titular, float cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrar() {
        System.out.println("\nTitular de la cuenta: " + titular);
        System.out.println("Total en Cuenta: " + cantidad + "\n");
    }

    public void ingresar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el nombre del Titular: ");
        titular = teclado.nextLine();
        System.out.println("Ingresa el monto a depositar: ");
        float cantidadIntroducida = teclado.nextFloat();
        if (cantidadIntroducida > 0){
            cantidad += cantidadIntroducida;
        } else {
            System.out.println("Debes introducir una cantidad correcta");
        }
    }

    public void retirar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el monto a retirar: ");
        cantidad -= teclado.nextFloat();
    }
}
