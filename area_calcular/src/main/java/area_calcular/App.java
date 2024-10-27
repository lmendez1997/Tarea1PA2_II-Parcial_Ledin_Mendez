package area_calcular;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        areaCalcular calculator = new areaCalcular();

        while (true) {
            System.out.println("Seleccione una operación:");
            System.out.println("1 - Área del Círculo");
            System.out.println("2 - Área del Cuadrado");
            System.out.println("3 - Área del Rectángulo");
            System.out.println("4 - Área del Triángulo");
            System.out.println("5 - Salir");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Saliendo del programa...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Ingrese el radio: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Área del Círculo: " + calculator.areaCircle(radius));
                    break;
                case 2:
                    System.out.print("Ingrese el lado: ");
                    double side = scanner.nextDouble();
                    System.out.println("Área del Cuadrado: " + calculator.areaSquare(side));
                    break;
                case 3:
                    System.out.print("Ingrese el ancho: ");
                    double width = scanner.nextDouble();
                    System.out.print("Ingrese la altura: ");
                    double height = scanner.nextDouble();
                    System.out.println("Área del Rectángulo: " + calculator.areaRectangle(width, height));
                    break;
                case 4:
                    System.out.print("Ingrese la base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura: ");
                    height = scanner.nextDouble();
                    System.out.println("Área del Triángulo: " + calculator.areaTriangle(base, height));
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
        scanner.close();
    }
}

