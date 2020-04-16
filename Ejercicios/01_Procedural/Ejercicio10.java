import java.util.Scanner;

/**
 * Ejercicio09
 */
public class Ejercicio10 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int edad;
        System.out.println("Ingrese edad: ");
        edad = Entrada.nextInt();
        if (edad <= 12)
            System.out.println("menor");
        else if (edad <= 18)
            System.out.println("cadete");
        else if (edad <= 26)
            System.out.println("juvenil");
        else
            System.out.println("mayor");

    }
}
