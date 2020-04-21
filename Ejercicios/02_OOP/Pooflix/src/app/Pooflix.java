package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Pooflix
 */
public class Pooflix {

    public List<Pelicula> peliculas = new ArrayList<Pelicula>();
    public List<Serie> series = new ArrayList<Serie>();

    public Serie buscarSerie(String titulo) {
        for (Serie s : this.series) {
            if (s.nombre.equals(titulo))
                return s;
        }
        return null;
    }

    public void inicializarCatalogo() {
       this.inicializarBreakingBad();
       this.inicializarLucifer();
    }

    public void inicializarBreakingBad() {
        Serie breakingB = new Serie();
        breakingB.nombre = "Breaking Bad";

        Actor actor1 = new Actor();
        actor1.nombre = "Brian Crasnton";

        Clasificacion clasificacion = new Clasificacion();
        clasificacion.descripcion = "Mayor 18";
        clasificacion.edadMinima = 18;
        clasificacion.tipo = "M";

        breakingB.clasificacion = clasificacion;

        breakingB.calificacion = 9;

        breakingB.elenco.add(actor1);

        Genero genero = new Genero();
        genero.nombre = "Drama";
        breakingB.genero = genero;

        Temporada t5 = new Temporada();
        t5.numero = 5;

        Episodio ep = new Episodio();

        ep.numero = 7;
        ep.nombre = "Say my name";
        ep.duracion = 43;

        t5.episodios.add(ep);

        ep = new Episodio();

        ep.numero = 5;
        ep.nombre = "Ozymandias";
        ep.duracion = 41;

        t5.episodios.add(ep);

        Websodio webi = new Websodio();
        webi.numero = 20;
        webi.nombre = "Episodio web";
        webi.duracion = 30;
        webi.url = "http://direccion.com";

        t5.episodios.add(webi);

        breakingB.temporadas.add(t5);

        this.series.add(breakingB);

        

    }
    public void inicializarLucifer() {

    }

}
