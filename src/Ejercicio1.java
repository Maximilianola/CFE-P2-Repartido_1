import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = leer.nextLine();

        System.out.println("");
        System.out.println("Bienvenido al sistema " + nombre);

    }
}