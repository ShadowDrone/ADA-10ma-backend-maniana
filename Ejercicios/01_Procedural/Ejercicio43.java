import java.util.Scanner;

/**
 * Ejercicio46
 */
public class Ejercicio43 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int x1, x2, y1, y2, c = 0;
        System.out.println("Ingresar 3 rectangulos:\n");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nRectangulo " + (i + 1));
            System.out.println("x1, y1: ");
            x1 = Entrada.nextInt();

            y1 = Entrada.nextInt();
            System.out.println("x2, y2: ");
            x2 = Entrada.nextInt();
            y2 = Entrada.nextInt();
            if (esCuadrado(x1, y1, x2, y2))
                System.out.println("\nSu perimetro es: " + perimetro(x1, y1, x2, y2) + "\n");
            else
                c++;
        }
        System.out.println("\nDe los 3 rectangulos, " + c + " no son cuadrados.");
    }

    static boolean esCuadrado(int x1, int y1, int x2, int y2) {

        if (Math.abs(x1 - x2) == Math.abs(y2 - y1))
            return true;
        else
            return false;
    }

    static int perimetro(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) * 4;
    }
}
