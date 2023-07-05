import java.util.Scanner;

public class CalculadoraInteresCompuesto {
    public static void main(String[] args){
        System.out.println("Ingrese el Capital Inicial:");
        Scanner teclado = new Scanner(System.in);
        float inicial = teclado.nextFloat();
        System.out.println("Ingrese la Adicion Anual:");
        float adicionAnual = teclado.nextFloat();
        System.out.println("Ingrese la Cantidad de Años:");
        float cantidadAnos = teclado.nextFloat();
        System.out.println("Ingrese la Tasa de Interés:");
        float tasaInteres = teclado.nextFloat();

        float cantidadFinal = inicial;

        for (int i = 0; i < cantidadAnos; i++){
            cantidadFinal += adicionAnual;
            cantidadFinal += cantidadFinal * tasaInteres / 100;
        }
        System.out.println("Al finalizar vas a tener: $" + cantidadFinal);
    }
}
