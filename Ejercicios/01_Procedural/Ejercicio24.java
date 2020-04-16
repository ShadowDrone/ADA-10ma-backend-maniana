import java.util.Scanner;

/**
 * Ejercicio20
 */
public class Ejercicio24 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int i, j, m, numero, numero_ant, c, c1, c2, c3, c4, d, c3max, c4max;
        c = c1 = c2 = c3 = c4 = d = c3max = c4max = 0;
        char color, color_ant;
        boolean b = false;
        System.out.println("Ingresar cantidad de pares: ");
        m = Entrada.nextInt();
        ;
        System.out.println("\nIngresar color y numero de cada par (\"r\" para rojo, \"n\" para negro):\n\n");
        color = Entrada.nextLine().charAt(0);
        numero = Entrada.nextInt();
        color_ant = color;
        numero_ant = numero;
        int primer_numero = numero;
        int ant_cero[] = new int[m];
        if (numero == 0)
            c++;
        if (numero < 12 || numero > 23)
            b = true;
        for (i = 1; i < m; i++) {
            color = Entrada.nextLine().charAt(0);
            numero = Entrada.nextInt();
            ;
            if (numero == 0) {
                c++;
                ant_cero[d] = numero_ant;
                d++;
            }
            if (color == 'n' && color_ant == 'n')
                c1++;
            if (numero == numero_ant)
                c2++;
            if (color != color_ant) {
                c3++;
                if (c3 > c3max)
                    c3max = c3;
            } else
                c3 = 0;
            if ((numero < 12 || numero > 23) && b) {
                c4++;
                if (c4 > c4max)
                    c4max = c4;
            } else
                c4 = 0;
            if (numero < 12 || numero > 23)
                b = true;
            else
                b = false;
            color_ant = color;
            numero_ant = numero;
        }
        System.out.println("\nEl numero 0 salio " + c + " veces.\n");
        System.out.println("Los numeros anteriores al cero fueron: ");
        if (primer_numero != 0)
            for (j = 0; j < c; j++)
                System.out.println(ant_cero[j] + ' ');
        else
            for (j = 0; j < c - 1; j++)
                System.out.println(ant_cero[j] + ' ');
        System.out.println("\nEl color negro se repitio " + c1 + " veces.\n");
        System.out.println("El mismo numero se repitio " + c2 + " veces.\n");
        System.out.println("El mayor numero de veces seguidas que salieron alternados \nlos colores rojo y negro fue "
                + c3max + "\n");
        System.out.println("El mayor numero de veces seguidas que se nego la segunda docena fue " + c4max + "\n");
    }
}
