package app;

import java.util.Scanner;

/**
 * Ejercicio en forma OOP ocultando los lados del triangulo.
 */
public class App {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int numero1, numero2, numero3;
        System.out.println("Ingresar los lados del triangulo:");
        numero1 = Teclado.nextInt();
        numero2 = Teclado.nextInt();
        numero3 = Teclado.nextInt();

        Triangulo triangulo = new Triangulo(numero1, numero2, numero3);

        System.out.println("El triangulo es " + triangulo.resolverTipo() + ".");
    }
}