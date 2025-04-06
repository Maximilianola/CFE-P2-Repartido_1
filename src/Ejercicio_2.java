import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        System.out.print("Por favor, ingrese el primer número: ");
        int num1=leer.nextInt();

        System.out.print("Por favor, ingrese el segundo número: ");
        int num2=leer.nextInt();

        System.out.println("");
        System.out.println("El resultado de la SUMA de ambos número es: " + (num1+num2));
    }
}
