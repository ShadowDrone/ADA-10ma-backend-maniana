import java.util.Scanner;

/**
 * Ejercicio35
 */
public class EjercicioExtra05 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b;
        System.out.println("Ingresar dos valores: ");
        a = Entrada.nextInt();
        b = Entrada.nextInt();
        if (esMultiplo(a, b))
            System.out.println(a + " es multiplo de " + b);
        else
            System.out.println(a + " no es multiplo de " + b);
    }

    static boolean esMultiplo(int a, int b) {
        if (a % b == 0)
            return true;
        else
            return false;
    }
}
