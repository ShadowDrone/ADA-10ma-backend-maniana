import java.util.Scanner;

/**
 * Ejercicio12
 */
public class Ejercicio14 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int k, i, j, ce, c = 0;
        char cr;
        System.out.println("Ingresar numero de equipos: ");
        k = Entrada.nextInt();
        for (i = 0; i < k; i++) {
            System.out.println("\nIngresar codigo de equipo: ");
            ce = Entrada.nextInt();
            for (j = 0; j < k - 1; j++) {
                System.out.println("Ingresar codigo de resultado: ");
                cr = Entrada.nextLine().charAt(0);
                switch (cr) {
                case 'g':
                    c += 3;
                    break;
                case 'e':
                    c++;
                    break;
                }
            }
            System.out.println("\nEquipo " + ce + ": " + c + " puntos.\n");
            c = 0;
        }

    }
}
