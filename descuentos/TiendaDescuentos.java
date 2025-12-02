import java.util.Scanner;

public class TiendaDescuentos {

    public static double calcularSubtotal(double[] precios) {
        double subtotal = 0;
        for (double precio : precios) {
            subtotal += precio;
        }
        return subtotal;
    }

    public static double obtenerDescuentoBase(String tipoCliente) {
        switch (tipoCliente.toLowerCase()) {
            case "normal":
                return 0.10; // 10%
            case "premiere":
                return 0.15; // 15%
            default:
                System.out.println("Tipo de cliente no valido, se aplicara descuento de cliente normal.");
                return 0.10;
        }
    }

    public static double obtenerDescuentoAdicional(int cantidadArticulos, double subtotal) {
        if (cantidadArticulos < 5) {
            return 0.0; // Solo aplican si compra 5 exactos
        }

        if (subtotal <= 1000) {
            return 0.05; // 5%
        } else if (subtotal <= 2000) {
            return 0.10; // 10%
        } else {
            return 0.15; // 15%
        }
    }

    public static void mostrarResumen(String tipoCliente, double subtotal, double descuentoBase, double descuentoExtra, double total) {
        System.out.println("\n==============================");
        System.out.println("        RESUMEN DE COMPRA");
        System.out.println("==============================");
        System.out.println("Cliente tipo: " + tipoCliente);
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Descuento base: %.0f%%\n", descuentoBase * 100);
        System.out.printf("Descuento adicional: %.0f%%\n", descuentoExtra * 100);
        System.out.printf("Total a pagar: $%.2f\n", total);
        System.out.println("==============================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] precios = new double[5];

        System.out.println("===================================");
        System.out.println(" BIENVENIDO A TIENDA DE LA ESQUINA ");
        System.out.println("===================================");
        System.out.print("Ingrese tipo de cliente (Normal / Premiere): ");
        String tipoCliente = sc.nextLine().trim();

        System.out.println("\nIngrese el precio de sus 5 artículos:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Artículo " + (i + 1) + ": $");
            precios[i] = sc.nextDouble(); //momento lista
        }

        double subtotal = calcularSubtotal(precios);
        double descuentoBase = obtenerDescuentoBase(tipoCliente);
        double descuentoExtra = obtenerDescuentoAdicional(5, subtotal);
        double totalDescuento = subtotal * (descuentoBase + descuentoExtra);
        double total = subtotal - totalDescuento;

        mostrarResumen(tipoCliente, subtotal, descuentoBase, descuentoExtra, total);

        System.out.println("\nGracias por su compra ¡Vuelva pronto!");
        sc.close(); // Memory saving momento
    }
}
