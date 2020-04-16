import java.util.Scanner;

/**
 * Ejercicio22
 */
public class Ejercicio44 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        char tipo = '1', gravedad;
        int valor, menor_valor = 0, total_l = 0, total_m = 0, total_g = 0, c1 = 0, c2 = 0;
        String motivo, motivo_menor;
        Boolean b = false;
        motivo_menor = "nada";
        System.out
                .println("Ingresar tipo de infraccion (1, 2, 3 o 4), motivo, valor de la multa y gravedad (L, M o G), "
                        + "(ingresar tipo igual a 0 para terminar):\n\n");
        System.out.println("Tipo: ");
        tipo = Entrada.nextLine().charAt(0);
        while (tipo != '0') {
            System.out.println("Motivo: ");

            motivo = Entrada.nextLine();
            System.out.println("Valor: ");

            valor = Entrada.nextInt();
            System.out.println("Gravedad: ");

            gravedad = Entrada.nextLine().charAt(0);
            switch (gravedad) {
                case 'l':
                    total_l = total_l + valor;
                    break;
                case 'm':
                    total_m = total_m + valor;
                    break;
                default:
                    total_g = total_g + valor;
            }
            if (tipo == '3' && gravedad == 'g')
                c1++;
            if (tipo == '4' && gravedad == 'g')
                c2++;
            if (!b) {
                menor_valor = valor;
                motivo_menor = motivo;
                b = true;
            }
            if (valor < menor_valor && b) {
                menor_valor = valor;
                motivo_menor = motivo;
            }
            System.out.println("\nTipo: ");
            tipo = Entrada.nextLine().charAt(0);
        }
        System.out.println("\nEl total de las multas a pagar de infracciones de gravedad L es: " + total_l + ".\n"
                + "El total de las multas a pagar de infracciones de gravedad M es: " + total_m + ".\n"
                + "El total de las multas a pagar de infracciones de gravedad G es: " + total_g + ".\n");
        if (c1 > 3 || c2 > 3)
            System.out.println("Clausurar fabrica.\n");
        System.out.println("El motivo de la infraccion de menor valor es: " + motivo_menor);
    }
}
