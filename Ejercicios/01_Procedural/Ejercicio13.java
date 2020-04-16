import java.util.Scanner;

/**
 * Ejercicio11
 */
public class Ejercicio13 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int i, n;
        int a = 0;
        int c = 0;
        int a2 = 0;
        System.out.println("Ingrese 10 numeros");
        for (i = 1; i <= 10; i++) {
            n = Entrada.nextInt();
            if (n > 100) {
                a = a + n;
                c = c + 1;
            }
            if (n < -10) {
                a2 = a2 + n;
            }
        }
        System.out.println("El promedio de los mayores que 100 es: " + (a / c) + ".");
        System.out.println("La suma de los menores que -10 es: " + a2 + ".");

    }
}
