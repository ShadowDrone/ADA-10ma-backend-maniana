import java.util.Scanner;

/**
 * Ejercicio40
 */
public class Ejercicio36 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b;
        System.out.println("Ingrese una base: ");
        a = Entrada.nextInt();
        System.out.println("Ingrese un exponente: ");
        b = Entrada.nextInt();
        System.out.println("\nLa potencia es: " + pow(a, b));
    }

    public static double pow(double x, double y) {
        double p = 1;
        if (y >= 0) {
            for (int i = 0; i < y; i++)
                p = p * x;
            return p;
        } else {
            y = -y;
            return 1 / pow(x, y);
        }
    }
}
