import java.util.Scanner;

/**
 * Ejercicio43
 */
public class EjercicioExtra09 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int a;
        System.out.println("Ingrese un numero: ");
        a = Entrada.nextInt();
        if (esPrimo(a))
            System.out.println("\nEl numero " + a + " es primo.");
        else
            System.out.println("\nEl numero " + a + " no es primo.");

    }

    static boolean esPrimo(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
