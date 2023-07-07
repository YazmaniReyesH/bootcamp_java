package FigurasGeometricas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("*************** MENU ***************:");
            System.out.println("1. Crear Triángulo");
            System.out.println("2. Crear Rectángulo");
            System.out.println("3. Crear Círculo");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            int opcionUsuario = scanner.nextInt();

            switch (opcionUsuario) {
                case 1:
                    System.out.println("Ingresa los lados del triángulo:");
                    System.out.println("Lado 1: ");
                    double lado1 = scanner.nextDouble();
                    System.out.println("Lado 2: ");
                    double lado2 = scanner.nextDouble();
                    System.out.println("Lado 3: ");
                    double lado3 = scanner.nextDouble();
                    Figura triangulo = new Triangulo(lado1, lado2, lado3);
                    System.out.println("Área del triángulo: " + triangulo.calcularArea());
                    System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
                    break;
                case 2:
                    System.out.println("Ingresa la base y la altura del rectángulo:");
                    System.out.println("Base: ");
                    double baseRectangulo = scanner.nextDouble();
                    System.out.println("Altura: ");
                    double alturaRectangulo = scanner.nextDouble();
                    Figura rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
                    System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
                    System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
                    break;
                case 3:
                    System.out.println("Ingrese el radio del círculo:");
                    System.out.println("Radio: ");
                    double radioCirculo = scanner.nextDouble();
                    Figura circulo = new Circulo(radioCirculo);
                    System.out.println("Área del círculo: " + circulo.calcularArea());
                    System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }
}
