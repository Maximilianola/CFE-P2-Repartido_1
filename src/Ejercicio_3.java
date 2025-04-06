import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner LeerTeclado=new Scanner(System.in);

        System.out.print("Ingrese el año actual: ");
        int AñoActual=LeerTeclado.nextInt();

        System.out.print("Ingrese año de nacimiento: ");
        int AñoNacimiento=LeerTeclado.nextInt();

        System.out.println("La edad es: " + (AñoActual-AñoNacimiento));



    }
}
