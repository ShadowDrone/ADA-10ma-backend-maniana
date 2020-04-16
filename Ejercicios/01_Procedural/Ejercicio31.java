import java.util.Scanner;

/**
 * Ejercicio33
 */
public class Ejercicio31 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int a;
        System.out.println("Ingrese un valor: ");
        a = Entrada.nextInt();
        System.out.println("\nSu factorial es: " + factorial(a));
    }

    static long factorial(int n) {
        long a = 1;
        int i;
        if (n >= 0) {
            for (i = 1; i <= n; i++)
                a = a * i;
            return a;
        } else {
            n *= -1;
            if (es_par(n)) {
                return factorial(n);
            } else {
                return factorial(n) * -1;
            }
        }
    }

    static boolean es_par(int a) {
        if (a % 2 == 0)
            return true;
        else
            return false;
    }

    static void mostrar_factoriales() {
        System.out.println("Los factoriales del 1 al 100 son: ");
        for (int i = 1; i <= 100; i++)
            System.out.println(i + " " + factorial(i));
    }
}
