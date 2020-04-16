import java.util.Scanner;

/**
 * Ejercicio36
 */
public class Ejercicio32 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int n, a, i, cm3 = 0, cm5 = 0, cm7 = 0, cm35 = 0;
        System.out.println("Ingresar cantidad de numeros: ");
        n = Entrada.nextInt();
        System.out.println("Ingrese " + n + " numeros: ");
        for (i = 0; i < n; i++) {
            a = Entrada.nextInt();
            System.out.println("\nEl factorial de " + a + " es " + factorial(a));
            if (esMultiplo(a, 3))
                cm3++;
            if (esMultiplo(a, 5))
                cm5++;
            if (esMultiplo(a, 7))
                cm7++;
            if (esMultiplo(a, 3) && esMultiplo(a, 5))
                cm35++;
        }
        System.out.println("\n\nHay " + cm3 + " multiplos de 3.");
        System.out.println("Hay " + cm5 + " multiplos de 5.");
        System.out.println("Hay " + cm7 + " multiplos de 7.");
        System.out.println("Hay " + cm35 + " multiplos de 3 y de 5.");
    }

    static int factorial(int n) // para numeros negativos se uso la formula (-n)! = n! * (-1)^n
    {
        int a = 1;
        int i;
        if (n >= 0) // si n = 0, el for no se ejecuta y retorna 1, 0! = 1
        {
            for (i = 1; i <= n; i++)
                a = a * i;
            return a;
        } else // n es negativo
        {
            n *= -1; // se lo positiviza
            if (es_par(n)) {
                return factorial(n); // si n es par, (-1)^n = 1
            } else {
                return factorial(n) * -1; // si n es impar, (-1)^n = -1
            }
        }
    }

    static boolean es_par(int a) {
        if (a % 2 == 0)
            return true;
        else
            return false;
    }

    static boolean esMultiplo(int a, int b) {
        if (a % b == 0)
            return true;
        else
            return false;
    }
}
