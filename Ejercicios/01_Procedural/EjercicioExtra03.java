import java.util.Scanner;

/**
 * Ejercicio27
 */
public class EjercicioExtra03 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int n, i, c = 0, a = 1, b = 1;
        System.out.println("Ingrese un no.: ");
        n = Entrada.nextInt();
        if (n != 1 && n != 2) {
            for (i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("\nEl " + n + "o. termino de la sucesion de Fibonacci es: " + c + ".\n");
        } else
            System.out.println("\nEl " + n + "o. termino de la sucesion de Fibonacci es: 1.\n");
    }
}
