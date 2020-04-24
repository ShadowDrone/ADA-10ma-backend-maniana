package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Pooflix
 */
public class Pooflix {

    public List<Pelicula> peliculas = new ArrayList<Pelicula>();
    public List<Serie> series = new ArrayList<Serie>();

    public List<INominable> nomidados = new ArrayList<>();

    public Serie buscarSerie(String titulo) {
        for (Serie s : this.series) {
            if (s.nombre.equals(titulo))
                return s;
        }
        return null;
    }

    public void inicializarCatalogo() {
        inicializarPelis();
        this.inicializarBreakingBad();
        this.inicializarLucifer();
    }

    public void inicializarPelis() {
        Pelicula peli = new Pelicula();
        peli.nombre = "The Shining";
        Actor actor = new Actor();
        actor.nombre = "Jack";

        peli.elenco.add(actor);

        this.peliculas.add(peli);

        peli = new Pelicula();
        peli.nombre = "Deadpool";
        actor = new Actor();
        actor.nombre = "Ryan";

        peli.elenco.add(actor);

        this.peliculas.add(peli);

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

        Episodio ep = new Episodio(7, "Say my name", 43);

        // ep.descripcion = "Esta es la descripcion";
        ep.setDescripcion("Esta es la descripcion");
        ep.setAnio(2000);

        t5.episodios.add(ep);

        ep = new Episodio(5, "Ozymandias", 41);

        // ep.numero = 5;
        // ep.nombre = "Ozymandias";
        // ep.duracion = 41;

        t5.episodios.add(ep);

        Websodio webi = new Websodio(20, "Episodio web", 30, "http://direccion.com");
        /*
         * webi.numero = 20; webi.nombre = "Episodio web"; webi.duracion = 30; webi.url
         * = "http://direccion.com";
         */

        t5.episodios.add(webi);

        breakingB.getTemporadas().add(t5);

        List<Temporada> tmp = breakingB.getTemporadas();

        this.series.add(breakingB);

    }

    public void inicializarLucifer() {

    }

    public void inicializarListaNominados() {

        for (Pelicula peli : this.peliculas) {
            this.nomidados.add(peli);
            for (Actor actor : peli.elenco)
                this.nomidados.add(actor);

        }
        for (Serie serie : this.series) {
            for (Actor actor : serie.elenco)
                this.nomidados.add(actor);

        }
    }

    public void reproducirTrailersDeNominacion() {
        for (INominable nominado : nomidados) {

            nominado.reproducirTrailerNominacion();
        }
    }

}
