import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner LecturaTeclado = new Scanner(System.in);
        System.out.print("Por favor ingrese su nombre: ");
        String nombre =LecturaTeclado.nextLine();

        System.out.println("Bienvenido al Repartido 1 " + nombre + ", éste será un gran año.");

    }

}