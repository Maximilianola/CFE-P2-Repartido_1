import java.util.Scanner;

public class Ejercicio6 {
    static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("SIMULADOR DE COMPRAS.\n");

        System.out.print("Ingrese el precio del primer producto: ");
        double prod1 = leer.nextDouble();

        System.out.print("Ingrese el precio del segundo producto: ");
        double prod2 = leer.nextDouble();

        System.out.print("Ingrese el precio del tercer producto: ");
        double prod3 = leer.nextDouble();

        double subtotal = (prod1 + prod2 + prod3);
        double iva = subtotal * 0.23;
        double total = (subtotal+iva);

        System.out.println();
        System.out.printf("El sub-total:     $%.2f\n", subtotal);
        System.out.printf("El IVA (23%%) es:  $%.2f\n", iva);
        System.out.printf("El total es:      $%.2f\n", total);
    }
}