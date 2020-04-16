import java.util.Scanner;

/**
 * Ejercicio23
 */
public class Ejercicio25 {

    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int palabra_larga = 0, c_a = 0, c_e = 0, c_i = 0, c_o = 0, c_u = 0, c_letras = 0, c_palabras = 0;
        char letras;
        System.out.println("Ingresar una frase: \n\n");
        letras = Entrada.nextLine().charAt(0);
        while (letras != '.') {
            while (letras != ' ') {
                switch (letras) {
                    case 'a':
                        c_a++;
                        break;
                    case 'e':
                        c_e++;
                        break;
                    case 'i':
                        c_i++;
                        break;
                    case 'o':
                        c_o++;
                        break;
                    case 'u':
                        c_u++;
                        break;
                }
                c_letras++;
                letras = Entrada.nextLine().charAt(0);
            }
            if (c_letras > palabra_larga)
                palabra_larga = c_letras;
            c_letras = 0;
            c_palabras++;
            letras = Entrada.nextLine().charAt(0);
        }
        System.out.println("La vocal a aparecio " + c_a + " veces.\n");
        System.out.println("La vocal e aparecio " + c_e + " veces.\n");
        System.out.println("La vocal i aparecio " + c_i + " veces.\n");
        System.out.println("La vocal o aparecio " + c_o + " veces.\n");
        System.out.println("La vocal u aparecio " + c_u + " veces.\n");
        System.out.println("La oracion contiene " + c_palabras + " palabras.\n");
        System.out.println("La palabra mas larga contiene " + c_letras + " letras.\n");
    }
}
