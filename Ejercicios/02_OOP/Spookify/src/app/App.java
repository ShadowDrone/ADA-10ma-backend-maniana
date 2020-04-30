package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);
    public static Spookify ServicioSpookify;

    public static void main(String[] args) throws Exception {
        // Opciones a ingresar
        // 1. Crear Artista
        // 2. Crear un Album
        // 3. Crear una Cancion
        // 4. Reproducir cancion
        // 5. Listar canciones.
        // ESC. Salir

        int opcion = 0;

        ServicioSpookify = inicializar();
        do {

            opcion = elegirOpcion();

            switch (opcion) {
                case 1:
                    crearArtista();
                    break;
                case 2:
                    crearAlbum();
                    break;
                case 3:
                    crearCancion();
                    break;
                case 4:
                    reproducirCancion();
                    break;
                case 5:
                    listarCanciones();
                    break;
                case 6:
                    listarArtistas();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    break;
            }
        } while (opcion != 0);
    }

    public static int elegirOpcion() {

        System.out.println("*********************");
        System.out.println("1. Crear Artista");
        System.out.println("2. Crear Album");
        System.out.println("3. Crear Cancion");
        System.out.println("4. Reproducir Cancion");
        System.out.println("5. Listar canciones");
        System.out.println("6. Listar artistas");
        System.out.println("0. Salir");
        System.out.println("*********************");

        int opcion;

        opcion = Teclado.nextInt();
        Teclado.nextLine();

        return opcion;

    }

    /** Logica para crear un artista pidiendo datos por teclado */
    public static void crearArtista() {
        
        System.out.println("Ingrese el nombre del artista");


        Artista artistaNuevo = new Artista();
        artistaNuevo.nombre = Teclado.nextLine();

        ServicioSpookify.artistas.add(artistaNuevo);

        System.out.println("Artista creado!");
    }

    public static void crearAlbum() {
        // TODO(A Hacer): toda la logica que pide el dato del album y lo agrega.

        String nombreArtista;

        Album albunNuevo = new Album();

        System.out.println("Ingrese Nombre del album");

        albunNuevo.nombre = Teclado.nextLine();

        System.out.println("Ingrese Año");

        albunNuevo.anio = Teclado.nextInt();
        Teclado.nextLine();

        System.out.println("Ingrese Nombre del Artista");
        nombreArtista = Teclado.nextLine();

        // Se asume que siempre existe, no hace validaciones adicionales
        albunNuevo.artista = ServicioSpookify.buscarArtista(nombreArtista);

        ServicioSpookify.albums.add(albunNuevo);

        System.out.println("Albun creado!");
    }

    public static void crearCancion() {

        String nombreAlbum;

        Cancion cancionNueva = new Cancion();

        System.out.println("Ingrese Nombre de la cancion");

        cancionNueva.nombre = Teclado.nextLine();

        System.out.println("Ingrese La duracion(segundos)");

        cancionNueva.duracion = Teclado.nextInt();
        Teclado.nextLine();

        System.out.println("Ingrese la letra de la cancion");
        cancionNueva.letra = Teclado.nextLine();

        System.out.println("Ingrese Nombre del Album");
        nombreAlbum = Teclado.nextLine();

        // Se asume que siempre existe, no hace validaciones adicionales
        Album albumCancion = ServicioSpookify.buscarAlbum(nombreAlbum);

        cancionNueva.album = albumCancion;
        cancionNueva.artista = albumCancion.artista;
        albumCancion.canciones.add(cancionNueva);

        System.out.println("Cancion crada!");
    }

    public static void reproducirCancion() {
        String nombreCancion;
        Cancion cancionAReproducir;

        System.out.println("Ingrese Nombre de la cancion");

        nombreCancion = Teclado.nextLine();

        cancionAReproducir = ServicioSpookify.buscarCancion(nombreCancion);

        cancionAReproducir.reproducir();
    }

    public static void listarCanciones() {
        System.out.println("Listando las canciones");

        // A1,A2,A3,A4/
        for (Album album : ServicioSpookify.albums) {
            System.out.println("***************");
            System.out.println("Album: " + album.nombre);
            System.out.println("Artista: " + album.artista.nombre);

            for (Cancion cancion : album.canciones) {
                System.out.println("-" + cancion.nombre + " (" + cancion.duracion + ")");
            }
        }
    }

    public static void listarArtistas() {
        System.out.println("Listando las artistas");

        System.out.println("***************");

        for (Artista artis : ServicioSpookify.artistas) {
            System.out.println("Artista: " + artis.nombre);

        }
    }

    public static Spookify inicializar() {

        Spookify servicio = new Spookify();

        // AC/DC
        Artista artista = new Artista();
        artista.nombre = "AC/DC";

        servicio.artistas.add(artista);

        Album album1 = new Album();

        album1.nombre = "Highway to Hell";
        album1.artista = artista;
        album1.anio = 1979;

        Cancion cancion = new Cancion();
        cancion.nombre = "Highway to Hell";
        cancion.artista = artista;
        cancion.album = album1;
        cancion.duracion = 208;// seconds
        cancion.letra = "Living easy, living free\n";
        cancion.letra += "Season ticket on a one-way ride\n";
        cancion.letra += "Asking nothing, leave me be\n";
        cancion.letra += "Taking everything in my stride\n";
        cancion.letra += "Don't need reason, don't need rhyme\n";
        cancion.letra += "Ain't nothing I would rather do\n";
        cancion.letra += "Going down, party time\n";
        cancion.letra += "My friends are gonna be there too";

        album1.canciones.add(cancion);

        cancion = new Cancion();
        cancion.nombre = "Shot Down in Flames";
        cancion.artista = artista;
        cancion.album = album1;
        cancion.duracion = 200;// seconds
        cancion.letra = "Aca va la letra de show down in flames";

        album1.canciones.add(cancion);

        servicio.albums.add(album1);

        // Tusa!
        artista = new Artista();
        artista.nombre = "Karol G";

        album1 = new Album();

        album1.nombre = "Tusa";
        album1.artista = artista;
        album1.anio = 2019;

        cancion = new Cancion();
        cancion.nombre = "Tusa";
        cancion.artista = artista;
        cancion.album = album1;
        cancion.duracion = 200;// seconds
        cancion.letra = "Pero si le ponen la cancion...";

        album1.canciones.add(cancion);

        servicio.artistas.add(artista);
        servicio.albums.add(album1);

        return servicio;
    }
}