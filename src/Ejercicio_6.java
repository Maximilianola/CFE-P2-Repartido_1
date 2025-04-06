import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner LeerTeclado=new Scanner(System.in);

        System.out.print("Ingrese el precio del primer producto: ");
        float primer=LeerTeclado.nextFloat();

        System.out.print("Ingrese el precio del segundo producto: ");
        float segundo=LeerTeclado.nextFloat();

        System.out.print("Ingrese el precio del tercer producto: ");
        float tercer=LeerTeclado.nextFloat();

        System.out.println();
        System.out.println("El subtotal es: " + (primer+segundo+tercer));
        System.out.println("El I.V.A. es: " + (primer+segundo+tercer)*23/100);
        System.out.println("El TOTAL es: "+ (((primer+segundo+tercer)*23/100)+(primer+segundo+tercer)));
    }
}
