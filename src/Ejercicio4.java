import java.util.Scanner;

public class Ejercicio4 {
    static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        double base = leer.nextDouble();
        System.out.println("Ingrese la altura: ");
        double altura = leer.nextDouble();
        System.out.println();

        if (base<0 || altura <0){
            System.out.println("No se puede calcular el área del rectángulo.");
            System.out.println("Por definición la base y altura deben ser números positivos.");
        } else{
            System.out.println("El área del rectángulo es: " + ((base * altura) / 2));
        }
    }
}