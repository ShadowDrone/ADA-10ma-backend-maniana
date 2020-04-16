import java.util.Scanner;

/**
 * Ejercicio18
 */
public class Ejercicio22 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        double v, a = 0, c = 0, valor_max = 0, valor_min = 0, valor_rango = 0;
        boolean b1 = false, b2 = false, b3 = false;
        System.out.println("Ingrese valores, 0 para terminar:");
        v = Entrada.nextDouble();
        while (v != 0) {
            if (v < 0 && b1 == false) {
                valor_max = v;
                b1 = true;
            }
            if (v > 0 && b2 == false) {
                valor_min = v;
                b2 = true;
            }
            if (v >= -17.3 && v <= 26.9 && b3 == false) {
                valor_rango = v;
                b3 = true;
            }
            if (v < 0 && b1 && v > valor_max)
                valor_max = v;
            if (v > 0 && b2 && v < valor_min)
                valor_min = v;
            if (v >= -17.3 && v <= 26.9 && b3 && v < valor_rango)
                valor_rango = v;
            a = a + v;
            c++;
            v = Entrada.nextDouble();
        }
        if (b1 || b2 || b3) {
            if (b1)
                System.out.println("\nEl valor maximo negativo es: " + valor_max + ".\n");
            else
                System.out.println("No hubo valores negativos.\n");
            if (b2)
                System.out.println("El valor minimo positivo es: " + valor_min + ".\n");
            else
                System.out.println("No hubo valores positivos.\n");
            if (b3)
                System.out.println("El valor minimo dentro del rango -17.3 y 26.9 es: " + valor_rango + ".\n");
            else
                System.out.println("No hubo valores dentro del rango -17.3 y 26.9.\n");
            System.out.println("El promedio de todos los valores ingresados es: " + a / c + ".\n");
        } else
            System.out.println("\nNo hubo valores.\n");
    }
}
