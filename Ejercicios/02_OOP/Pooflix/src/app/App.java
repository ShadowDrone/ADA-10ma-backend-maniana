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

        // websodio
        elTop = laMejorTemporada.getEpisodio(20);

        elTop.reproducir();

        System.out.println("Empezando otra cosa");

        Episodio epiDemo;

        int posicion = 0;

        /// En base a un numero de posicion de episodio, obtenerlo de la lista
        System.out.println("Ingrese la posicion");

        posicion = Teclado.nextInt();

        epiDemo = laMejorTemporada.getEpisodioAtPosicion(posicion);

        epiDemo.reproducir();

        // primero: preguntar si es un objeto de X tipo, usando el operador "instanceof"
        // segundo: usando el operador de casteo. (es decir, "transformando" la
        // referencia)
        if (epiDemo instanceof Websodio) {
            Websodio webi = (Websodio) epiDemo;
            webi.enviarAlertaDeQueEstaOnline();

        } else {
            System.out.println("No hay que hacer mas nada con un Episodio");
        }

        miPooflix.inicializarListaNominados();

        miPooflix.reproducirTrailersDeNominacion();

        int lala;

        lala = 0;
    }

}