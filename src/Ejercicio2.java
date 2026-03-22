import java.util.Scanner;

public class Ejercicio2 {
    static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = leer.nextInt();
        System.out.println();
        System.out.println("La suma es: " + (num1 + num2));
    }
}
