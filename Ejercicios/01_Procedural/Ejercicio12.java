import java.util.Scanner;

/**
 * Ejercicio10
 */
public class Ejercicio12 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b, p;
        p = 0;
        System.out.println("Ingrese dos numeros enteros a multiplicar:");
        a = Entrada.nextInt();
        b = Entrada.nextInt();
        for (int n = 1; n <= b; n++) {
            p = p + a;
        }
        System.out.println("El producto es: " + p);
    }
}
