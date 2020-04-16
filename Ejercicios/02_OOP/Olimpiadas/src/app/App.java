package app;

public class App {
    public static void main(String[] args) throws Exception {

        Olimpiada olimpiada2020CoronaEdition = new Olimpiada();

        // Tipo dato, nombre variable -> Instanciar
        Maratonista maratonista = new Maratonista();

        maratonista.nombre = "Forest Gump";
        maratonista.edad = 30;
        maratonista.energia = 100;

        System.out.println("Voy a poner a correr a " + maratonista.nombre);

        while (maratonista.energia > 0) {
            maratonista.correr();
            /*if (maratonista.correr()) {
                System.out.println(maratonista.nombre + " Comenzo a correr");
            } else {
                System.out.println(maratonista.nombre + " esta pachucho");
            }*/
        }

        /*
         * Maratonista maratonista2 = new Maratonista();
         * 
         * maratonista2.nombre = "Usain Bolt"; maratonista2.edad = 33;
         * 
         * System.out.println("Voy a poner a correr a " + maratonista2.nombre);
         * maratonista2.correr();
         */


        System.out.println("");

        Basquetbolista basquetbolista = new Basquetbolista();

        basquetbolista.nombre = "Manu";
        basquetbolista.entrenar();
        //Olimpiada es una clase que NO se instancian objetos
        //La lista de participants es a nivel GLOBAL.
        //No habia participantes.
        olimpiada2020CoronaEdition.inscribir(maratonista);
        //Ahora hay un participante
        olimpiada2020CoronaEdition.inscribir(basquetbolista);
        //Ahora hay 2 partipantes.

        int cantidadParticipantes;
        cantidadParticipantes = olimpiada2020CoronaEdition.participantes.size();//tamaño de la lista

        System.out.print("La cantidad de Participantes es " + cantidadParticipantes);
    }
}