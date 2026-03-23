import java.util.Scanner;

public class Ejercicio7 {
    static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese su Nombre: ");
        String Nombre = leer.nextLine();

        System.out.print("Ingrese su Edad:   ");
        int Edad = leer.nextInt();
        leer.nextLine(); //Sino pongo esto no puedo leer ciudad xD

        System.out.print("Ingrese su Ciudad: ");
        String Ciudad = leer.nextLine();

        System.out.println();

        System.out.println(
                "Hola ".concat(Nombre)
                        .concat(", tenes ")
                        .concat(String.valueOf(Edad))
                        .concat(" y vivis en la ciudad de ")
                        .concat(Ciudad)
                        .concat(".")
        );
    }
}