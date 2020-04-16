import java.util.Scanner;

/**
 * Ejercicio03
 */
public class Ejercicio04 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int valor;
        System.out.println("Ingresar valor: ");
        valor = Entrada.nextInt();
        System.out.println("La quinta parte de dicho valor es: " + (valor / 5));
        System.out.println("El resto de la division por 5: " + (valor % 5));
        System.out.println("La septima parte de la quinta parte: " + (valor / 35));
    }
}
