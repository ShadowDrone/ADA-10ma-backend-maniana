import java.util.*;

/**
 * Ejercicio01 Ingresar 2 numeros enteros e imprimir la suma, resta y
 * multiplicacion de ambos.
 */
public class Ejercicio01 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b;

        System.out.println("Ingresar dos numeros enteros.");
        a = Entrada.nextInt();
        System.out.println("Ingrese el siguiente");
        b = Entrada.nextInt();
        System.out.println("La suma de los enteros es: " + (a + b));
        System.out.println("La diferencia de los enteros es: " + (a - b));
        System.out.println("El producto de los enteros es: " + (a * b));

    }
}