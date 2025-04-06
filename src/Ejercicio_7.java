import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner LeerTeclado=new Scanner(System.in);

        System.out.print("Ingrese su Nombre: ");
        String nombre=LeerTeclado.next();


        System.out.print("Ingrese su Edad: ");
        int edad=LeerTeclado.nextInt();


        System.out.print("Ingrese su Ciudad: ");
        String ciudad=LeerTeclado.next();

        System.out.println();
        System.out.print("Hola " + nombre + ", " + "tenes " + edad + " años y vivís en la ciudad de " + ciudad);

    }
}
