import java.util.Scanner;

/**
 * Ejercicio45
 */
public class EjercicioExtra10 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int a;
        System.out.println("Ingrese una suma de dinero: $");
        a = Entrada.nextInt();
        System.out.println("\nPara la suma de $" + a + " se necesitan:");
        System.out.println(calcularBilletes(a, 100) + " billetes de $100");
        System.out.println(calcularBilletes(a, 50) + " billetes de $50");
        System.out.println(calcularBilletes(a, 20) + " billetes de $20");
        System.out.println(calcularBilletes(a, 10) + " billetes de $10");
        System.out.println(calcularBilletes(a, 5) + " billetes de $5");
        System.out.println(calcularBilletes(a, 2) + " billetes de $2");
        System.out.println(calcularBilletes(a, 1) + " billetes de $1");
    }

    public static int calcularBilletes(Integer monto, int denom) {
        int cant = monto / denom;
        monto = monto % denom;
        return cant;
    }
}
