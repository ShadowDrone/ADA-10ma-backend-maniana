import java.util.Scanner;

/**
 * Ejercicio38
 */
public class EjercicioExtra08 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b;
        System.out.println("Ingresar dos numeros: ");
        a = Entrada.nextInt();
        b = Entrada.nextInt();
        System.out.println("El porcentaje de diferencia es del " + calcular_porcentaje_diferencia(a, b) + "%");
    }

    public static double calcular_porcentaje_diferencia(int a, int b) {
        return (b - a) * 100 / (a + b);
    }
}
