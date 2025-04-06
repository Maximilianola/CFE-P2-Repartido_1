import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner LeerTeclado=new Scanner(System.in);
        System.out.print("Ingrese la temperatura en °C (Grados Celsius): ");
        float Fahrenheit=LeerTeclado.nextFloat();

        Fahrenheit= Fahrenheit*9/5+32;

        System.out.printf("La temperatura en °F (Grados Fahrenheit es: " + Fahrenheit);
    }
}
