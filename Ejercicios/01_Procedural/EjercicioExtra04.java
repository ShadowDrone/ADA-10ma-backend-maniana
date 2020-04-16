import java.util.Scanner;

/**
 * Ejercicio28
 */
public class EjercicioExtra04 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int n, i, c = 0, a = 1, b = 1;
        System.out.println("Ingrese un no.: ");
        n = Entrada.nextInt();
        System.out.println("\nLos primeros " + n + " terminos de la sucesion de Fibonacci son:\n\n" + "1, 1, ");
        for (i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + ", ");
        }
        System.out.print("\n");
    }
}
