import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== CALCULADORA DE ÁREA Y PERÍMETRO ===");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Círculo");
            System.out.println("4. Triángulo");
            System.out.println("5. Pentagono");
            System.out.println("6. Rombo");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            // Errm esto se ve mas bonito que el if else
            switch (opcion) {
                case 1:
                    calcularCuadrado(scanner);
                    break;
                case 2:
                    calcularRectangulo(scanner);
                    break;
                case 3:
                    calcularCirculo(scanner);
                    break;
                case 4:
                    calcularTriangulo(scanner);
                    break;
                case 5:
                    calcularPentagono(scanner);
                    break;
                case 6:
                    calcularPentagono(scanner);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 7);
        // Cerramos el coso que lee
        scanner.close();
    }

    public static void calcularCuadrado(Scanner scanner) {
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;
        double perimetro = 4 * lado;

        System.out.println("--- CUADRADO ---");
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }

    public static void calcularRectangulo(Scanner scanner) {
        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("--- RECTÁNGULO ---");
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }

    public static void calcularCirculo(Scanner scanner) {
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;

        System.out.println("--- CÍRCULO ---");
        System.out.println("Área: " + area);
        System.out.println("Perímetro (Circunferencia): " + perimetro);
    }

    public static void calcularTriangulo(Scanner scanner) {
        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();
        System.out.print("Ingrese el lado 1: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Ingrese el lado 2: ");
        double lado2 = scanner.nextDouble();

        double area = (base * altura) / 2;
        double perimetro = base + lado1 + lado2;

        System.out.println("--- TRIÁNGULO ---");
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
    public static void calcularPentagono(Scanner scanner) {
        System.out.print("Ingrese el lado del pentagono: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese el apotema del pentagono: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;
        double perimetro = base * 5;

        System.out.println("--- Pentagono ---");
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
    public static void calcularRombo(Scanner scanner) {
        System.out.print("Ingrese la diagonal mayor ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese el diagonal menor: ");
        double altura = scanner.nextDouble();
        System.out.print("Ingrese el lado del rombo: ");
        double lado = scanner.nextDouble();

        double area = (base * altura) / 2;
        double perimetro = lado * 4;

        System.out.println("--- Rombo ---");
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}
