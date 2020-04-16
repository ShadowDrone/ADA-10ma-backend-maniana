import java.util.Scanner;

/**
 * Ejercicio04
 */
public class Ejercicio05 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        double a;
        double b;
        System.out.println("Ingresar dos valores:");
        a = Entrada.nextInt();
        b = Entrada.nextInt();
        if (a > b)
            System.out.println("El mayor es " + a + ".");
        else
            System.out.println("El mayor es " + b + ".");

    }
}
