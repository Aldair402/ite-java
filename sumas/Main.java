import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== CALCULADORA BÁSICA ===");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    operar(scanner, "+");
                    break;
                case 2:
                    operar(scanner, "-");
                    break;
                case 3:
                    operar(scanner, "*");
                    break;
                case 4:
                    operar(scanner, "/");
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 5);

        scanner.close();
    }

    public static void operar(Scanner scanner, String operador) {
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;
        boolean valido = true;

        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: División por cero.");
                    valido = false;
                }
                break;
        }

        if (valido) { // Cuando el resultado es valido muestras resultado
                      // Si no tenemos resultado entonces daremos una variable inexistente
            System.out.println("Resultado: " + resultado);
        }
    }
}
