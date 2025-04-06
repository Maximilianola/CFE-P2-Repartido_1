import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner LeerTeclado=new Scanner(System.in);

        System.out.print("Ingrese la BASE del rectanculo (En cm): ");
        float base=LeerTeclado.nextFloat();

        System.out.print("Ingrese la ALTURA del rectanculo (En cm): ");
        float altura=LeerTeclado.nextFloat();

        System.out.println();
        System.out.println("El área del RECTANGULO es: " + (base*altura));
    }
}
