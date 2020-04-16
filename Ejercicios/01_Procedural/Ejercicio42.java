import java.util.Scanner;

/**
 * Ejercicio21
 */
public class Ejercicio42 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int i, peso, a = 0, max_peso = 0, c1 = 0, c2 = 0, c3 = 0;
        char idPuerto, idCont, max_cont = 'X';
        System.out.println("Ingresar Identificacion del contenedor, peso y puerto de arribo:\n\n");
        for (i = 1; i <= 5; i++) {
            idCont = Entrada.nextLine().charAt(0);
            peso = Entrada.nextInt();
            idPuerto = Entrada.nextLine().charAt(0);
            ;
            a = a + peso;
            if (peso > max_peso) {
                max_peso = peso;
                max_cont = idCont;
            }
            if (idPuerto == '1')
                c1++;
            else if (idPuerto == '2')
                c2++;
            else
                c3++;
        }
        System.out.println("\nEl buque debe trasladar " + a + " kilos.\n" + "El contenedor de mayor peso es el no. "
                + max_cont + " .\n" + "Al puerto 1 se trasladaran " + c1 + " contenedores.\n"
                + "Al puerto 2 se trasladaran " + c2 + " contenedores.\n" + "Al puerto 3 se trasladaran " + c3
                + " contenedores.\n");
    }
}
