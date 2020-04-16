import java.util.Scanner;

/**
 * Ejercicio26
 */
public class EjercicioExtra02 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int n, i, j;
        boolean b = false;
        System.out.println("Ingresar numero: ");
        n = Entrada.nextInt();
        System.out.println("\nLos primeros " + n + " numeros primos son:\n\n");
        for (i = 1; i <= n; i++) {
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0)
                    b = true;
            }
            if (!b)
                System.out.println(i + ", ");
            else
                n++;
            b = false;
        }
        System.out.println("\n");
    }
}
