import java.util.Scanner;

/**
 * Ejercicio16
 */
public class Ejercicio20 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int n, i, v, mayor = 0, menor = 0, mayor_pos = 0, menor_pos = 0;
        System.out.println("Ingrese cantidad de valores: ");
        n = Entrada.nextInt();
        System.out.println("Ingrese " + n + " valores:");
        for (i = 1; i <= n; i++) {
            v = Entrada.nextInt();
            if (i == 1) {
                mayor = v;
                menor = v;
                mayor_pos = 1;
                menor_pos = 1;
            }
            if (v > mayor) {
                mayor = v;
                mayor_pos = i;
            }
            if (v < menor) {
                menor = v;
                menor_pos = i;
            }
        }
        System.out.println("El mayor es " + mayor + " en el lugar " + mayor_pos);
        System.out.println("El menor es " + menor + " en el lugar " + menor_pos);
    }
}
