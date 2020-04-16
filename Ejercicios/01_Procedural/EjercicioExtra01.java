import java.util.Scanner;

/**
 * Ejercicio25
 */
public class EjercicioExtra01 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int j = 2, s = 0, n;
        System.out.println("Ingresar numero : ");
        n = Entrada.nextInt();
        while (j <= n / 2) {
            if (n % j == 0)
                s++;
            j++;
        }
        if (s == 0)
            System.out.println("El numero " + n + " es primo.\n\n");
        else
            System.out.println("El numero " + n + " no es primo.\n\n");
    }
}
