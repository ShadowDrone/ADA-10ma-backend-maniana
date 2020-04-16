import java.util.Scanner;

/**
 * Ejercicio06
 */
public class Ejercicio06 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int fecha1, fecha2;
        System.out.println("Ingresar dos fechas en formato aaaammdd:");
        fecha1 = Entrada.nextInt();
        fecha2 = Entrada.nextInt();
        if (fecha1 > fecha2)
            System.out.println("La fecha mas reciente es: " + fecha1);
        else
            System.out.println("La fecha mas reciente es: " + fecha2);

    }
}
