import java.util.Scanner;

/**
 * Ejercicio29
 */
public class Ejercicio27 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int i, n, c1 = 0, a1 = 0, a2 = 0, c2 = 0;
        System.out.println("Ingrese 167 valores, por favor.\n");
        for (i = 1; i <= 167; i++) {
            n = Entrada.nextInt();
            if (n == 0)
                c1++;
            if (n > 0) {
                a1 = a1 + n;
                c2++;
            }
            if (n < 0)
                a2 = a2 + n;
        }
        System.out.println("\nHubo " + c1 + " ceros.");
        System.out.println("El promedio de los valores positivos es: " + a1 / c2 + ".");
        System.out.println("La sumatoria de los valores negativos es: " + a2 + ".");
    }
}
