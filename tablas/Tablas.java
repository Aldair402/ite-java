import java.io.*;
import java.util.Scanner;  // Importar el scanner
public class Tablas {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion;
    do {
    System.out.println("Selecciona la tabla a mostrar: ");
    int tabla = sc.nextInt();
    if (tabla > 10 || tabla == 0){System.out.println("Seleccione otra opcion");}else{
    for (int i = 1; i <= 10; i++) {System.out.printf("%s x %d = %s \n", tabla, i, tabla*i);}
    }
    System.out.println("Deseas continuar? 1/0");
    opcion = sc.nextInt();
    } while (opcion == 1);
        sc.close();
    }
  }
