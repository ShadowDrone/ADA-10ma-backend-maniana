import java.util.Scanner;

/**
 * Ejercicio15
 */
public class Ejercicio19 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese 10 numeros:");
        int maximo = 0, i, n;
        for (i = 1; i <= 10; i++) {
            n = Entrada.nextInt();
            if (i == 1)
                maximo = n;
            if (n > maximo)
                maximo = n;
        }
        System.out.println("\nEl mayor es: " + maximo);

    }
}
