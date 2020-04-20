package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Pooflix miPooflix = new Pooflix();

        System.out.println("Iniciando Catalogo");

        miPooflix.inicializarCatalogo();

        Serie bb = miPooflix.buscarSerie("Breaking Bad");

        Temporada laMejorTemporada = bb.getTemporada(5);

        Episodio elTop;

        elTop = laMejorTemporada.getEpisodio(7);

        elTop.reproducir();

        elTop = laMejorTemporada.getEpisodio(5);

        elTop.reproducir();
        

    }

}