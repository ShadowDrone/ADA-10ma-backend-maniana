import java.util.Scanner;

/**
 * Ejercicio19
 */
public class Ejercicio23 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        double v, a = 0, valor_max, valor_min = -1;
        int c1 = 0, conj_max = -1, c = 0, pos_max = -1;
        boolean b = false;
        System.out.println(
                "Ingrese un conjunto de valores positivos, 0 para dividir conjuntos,\nun valor negativo para finalizar:\n");
        v = Entrada.nextDouble();
        ;
        valor_max = 0;
        while (v >= 0) {
            while (v != 0) {
                a = a + v;
                c++;
                if (v > valor_max) {
                    valor_max = v;
                    conj_max = c1 + 1;
                    pos_max = c;
                }
                if (!b) {
                    valor_min = v;
                    b = true;
                }
                if (v < valor_min && b)
                    valor_min = v;
                v = Entrada.nextDouble();
                ;
            }
            if (c == 0) {
                System.out.println("El subconjunto no tiene valores\n");
                v = Entrada.nextDouble();
                ;
            } else {
                c1++;
                System.out.println("\nEl promedio del subconjunto " + c1 + " es " + (a / c));
                System.out.println("El valor minimo del subconjunto " + c1 + " es " + valor_min);

                a = 0;
                c = 0;
                b = false;
                v = Entrada.nextDouble();
                ;
            }
        }
        if (c1 == 0)
            System.out.println("\nNo se procesaron subconjuntos.");
        else {
            System.out.println("\nEl total de subconjuntos procesados es " + c1);
            System.out.println("El valor maximo del conjunto es " + valor_max + " del subconjunto " + conj_max
                    + " en la posicion " + pos_max);
        }
    }
}
