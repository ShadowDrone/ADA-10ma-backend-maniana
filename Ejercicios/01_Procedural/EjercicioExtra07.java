import java.util.Scanner;

/**
 * Ejercicio44
 */
public class EjercicioExtra07 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int a;
        Integer b100 = 0, b50 = 0, b20 = 0, b10 = 0, b5 = 0, b2 = 0, b1 = 0;
        System.out.println("Ingrese una suma de dinero: $");
        a = Entrada.nextInt();
        calcular_cambio(a, b100, b50, b20, b10, b5, b2, b1);
        System.out.println("\nPara la suma de $" + a + " se necesitan:");
        System.out.println(b100 + " billetes de $100");
        System.out.println(b50 + " billetes de $50");
        System.out.println(b20 + " billetes de $20");
        System.out.println(b10 + " billetes de $10");
        System.out.println(b5 + " billetes de $5");
        System.out.println(b2 + " billetes de $2");
        System.out.println(b1 + " billetes de $1");

    }

    public static void calcular_cambio(int a, Integer b100, Integer b50, Integer b20, Integer b10, Integer b5,
            Integer b2, Integer b1) {
        int suma = a;
        b100 = suma / 100;
        suma = suma - b100 * 100;
        b50 = suma / 50;
        suma -= b50 * 50;
        b20 = suma / 20;
        suma -= b20 * 20;
        b10 = suma / 10;
        suma -= b10 * 10;
        b5 = suma / 5;
        suma -= b5 * 5;
        b2 = suma / 2;
        suma -= b2 * 2;
        b1 = suma;
    }
}
