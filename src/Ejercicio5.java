import java.util.Scanner;

public class Ejercicio5 {
    static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la Temperatura en grados Celsius: ");
        double gCeslius = leer.nextDouble();

        System.out.printf("");
        System.out.printf("La Temperatura en grados Fahrenheit es: " + ((gCeslius * 9/5) + 32));
    }
}