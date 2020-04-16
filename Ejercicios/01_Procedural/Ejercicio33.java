import java.util.Scanner;

/**
 * Ejercicio37
 */
public class Ejercicio33 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        Integer a, b, c = 0, d = 0;
        System.out.println("Ingrese dos numeros naturales: ");
        a = Entrada.nextInt();
        b = Entrada.nextInt();
        menor_factor_comun(a, b, c, d);
        System.out.println("El menor factor comun es: " + c + "/" + d);

    }

    public static void menor_factor_comun(int a, int b, Integer c, Integer d) {
        c = a / mcd(a, b);
        d = b / mcd(a, b);
    }

    public static int mcd(int a, int b) {
        int r;
        r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }
}
