package app;

import java.util.Scanner;

/**
 * Ejercicio OOP: usando los setters y un constructor basico.
 */
public class App2 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("Ingresar los lados del triangulo:");

        Triangulo triangulo = new Triangulo();
        
        triangulo.setLado1(Teclado.nextInt());
        triangulo.setLado2(Teclado.nextInt());
        triangulo.setLado3(Teclado.nextInt());

        System.out.println("El triangulo es " + triangulo.resolverTipo() + ".");
    }
}