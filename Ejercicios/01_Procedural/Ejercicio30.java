import java.util.Scanner;

/**
 * Ejercicio32
 */
public class Ejercicio30 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b;
        System.out.println("Ingresar dos numeros: ");
        a = Entrada.nextInt();
        b = Entrada.nextInt();
        System.out.println("\nEl maximo comun divisor es: " + mcd(a, b));

    }

    static int mcd(int a, int b) {
        int r;
        r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }
}
