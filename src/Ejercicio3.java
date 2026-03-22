import java.util.Scanner;

public class Ejercicio3 {
    static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el año actual: ");

        int FechaActual = leer.nextInt();
        System.out.print("Ingrese el año de nacimiento: ");
        int FechaNac = leer.nextInt();

        System.out.println();
        System.out.println("Edad: " + (FechaActual-FechaNac));
    }
}
