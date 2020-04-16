import java.util.Scanner;

/**
 * Ejercicio05
 */
public class Ejercicio05Bis {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        double a;
        double b;
        System.out.println("Ingresar dos valores:");
        a = Entrada.nextDouble();
        b = Entrada.nextDouble();
        if (a > b)
            System.out.println("El mayor es " + a + " y el menor es " + b + ".");
        else if (a < b)
            System.out.println("El mayor es " + b + " y el menor es " + a + ".");
        else
            System.out.println("Los valores son iguales.");
    }
}
