import java.util.Scanner;

/**
 * Ejercicio14
 */
public class Ejercicio17 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int i, m, a;
        a = -3;
        System.out.println("Ingrese un numero: ");
        m = Entrada.nextInt();
        System.out.println("Los primeros " + m + " multiplos de 3 que no lo son de 5 son:" + "\n\n");
        for (i = 1; i <= m; i++) {
            a += 3;
            if (a % 5 != 0)
                System.out.println(a + ", ");
            else
                i--;
        }

    }
}
