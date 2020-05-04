package app;

import java.util.ArrayList;
import java.util.List;

public class App {

    /**
     * Ejercicio para mostrar como funciona internamente un String (que es un Objeto
     * en Java) utilizando array(que no son listas) y mostrando diferentes tipos de arrays
     */
    public static void main(String[] args) throws Exception {

        // En este caso genere un String(es un Objecto en JAVA) con su valor fijo.
        // Un String, va a estar compuesto principalmente por una cadena de caracteres
        // esta cadena de caracteres la vamos a llamar array, en vez de ArrayList.
        String frase = "Hola manotas"; // String Literal

        // Como es un metodo, String tiene varios atributos.
        // length: devuelve el largo del string
        int largo;
        largo = frase.length();

        System.out.println("El largo del string es " + largo);

        // Obtener un caracter en una posicion()
        // El posicionamiento comienza desde 0, como en las listas
        // Recordar que cada lenguaje tiene su forma de obtener el primer elemento. En
        // este caso es 0.
        // Como esta compuesta por caracteres, al obtener una posicion obtendremos un
        // char
        char caracter;
        caracter = frase.charAt(0);

        System.out.println("el caracter en la primer posicion es " + caracter);

        // ahora el de la posicion 10
        caracter = frase.charAt(10);

        System.out.println("el caracter en la decima posicion es " + caracter);

        // Como recorro los elementos?
        // Usando los metodos en java
        System.out.println("Imprimpo caracter por caracter usando metodos del String");
        for (int i = 0; i < frase.length(); i++) {
            System.out.println(frase.charAt(i));
        }

        // Obteniendo el array de caracteres
        // En este caso, para determinar un ARRAY de caracteres, se usa el simbolo []
        // El simbolo [] es diferente al uso de List, ya que char al ser primitivo no
        // podemos usar
        // List<char>
        char[] caracteres;
        caracteres = frase.toCharArray();

        // En este caso, lo recorro usando el array
        // Prestar atencion que en este caso, el array tiene una propiedad length,
        // y no un metodo length() como tiene el String
        // por otro lado, cada posicion del array se debe usar el [], y el nro de
        // posicion en el medio
        // ese numero entre [] lo llamaremos posicion o index o subindice(de ahi viene
        // la letra i en
        // el for)
        System.out.println("Imprimo caracter por caracter usando un array con subindice");
        for (int i = 0; i < caracteres.length; i++) {
            System.out.println(caracteres[i]); // caracteres[i] => es el caracter en la posicion "i"

        }

        // Que es un char? un char puede ser representado como un int, por lo cual
        // podemos
        // transformar un array de char a un array de int
        // por que int? porque cada caracter en realidad es un numero en un mapa de
        // caracteres.

        // En este caso creo un array de numeros, pero con el largo del total de
        // caracteres
        int[] numeros = new int[caracteres.length];

        // Que desventaja tiene los arrays? que son de ancho fijo
        // no pueden agrandarse ni achicarse en JAVA.
        // pero son mas rapidos de leer y se usaban como forma de guardar
        // diferente info en procedural
        // por ejemplo el nombre y notas de alumnos, en procedural se guardaba como
        // 2 arrays, uno para nombre(string) y otro para notas(int)
        // y cada posicion estaba "relacionada" entre si, pero solo por el programador
        // que determinaba que la posicion 0 correspondia al primer alumno.

        for (int i = 0; i < caracteres.length; i++) {
            numeros[i] = (int) caracteres[i]; // casteo el caracter a int
        }

        // Se puede usar un foreach?: se puede usar un foreach
        for (char c : caracteres) {
            // Aca la logica para cada caracter
            // pero no tenemos la posicion :(
        }

        // Al mismo tiempo, un char puede ser representado por un array de bytes
        // Representacion minima de palabra que entiende la compu
        // un byte puede estar compuestos por 8 bits(antiguamente eran 8 o 7 y siempre
        // depende
        // de la arquitectura de la computadora)

        byte[] misBytes = new byte[caracteres.length];

        for (int i = 0; i < caracteres.length; i++) {
            misBytes[i] = (byte) caracteres[i]; // casteo el caracter a byte
        }

        // Puedo desde un array de enteros, transformarlo a un char?
        // por supuesto
        char[] caracteresRearmados = new char[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            caracteresRearmados[i] = (char) numeros[i]; // casteo el caracter a int
        }

        // Ese array de caracteres lo puedo trasnformar en un string?
        // por supuesto
        String fraseRearmada;
        fraseRearmada = new String(caracteresRearmados);

        System.out.println("La frase rearmada es: " + fraseRearmada);

        // Puedo usar arrays de Objetos? Por supuesto
        // En este caso creo un array de personas de 3 posiciones
        // pero todas las posiciones estan vacias.
        Persona[] personas = new Persona[3];
        List<Persona> personas2 = new ArrayList<>(); //

        // para llenarlas hay que hacer
        // en este caso en la posicion 0, ponemos una persona
        // esa persona puede ser referenciada por el array y la posicion
        // ya que cada elemento es una Persona.
        personas[0] = new Persona();
        personas[0].nombre = "Celeste";

        personas[1] = new Persona();
        personas[1].nombre = "Rosa";

        Persona persona = new Persona();
        persona = new Persona();
        persona.nombre = "Cecilia";

        personas2.add(persona);

        persona = new Persona();
        persona.nombre = "Liliana";

        personas2.add(persona);

        // Por mas que haya llenado 2 posiciones, siempre el largo del array es 3.
        // Porque los arrays SIEMPRE se crean con un ancho fijo, ya sea un numero o una
        // funcion/propiedad
        System.out.println("El largo del array es " + personas.length);
        System.out.println("El largo la lista es " + personas2.size());

        // Que usan otros lenguajes?
        // Otros lenguajes tienen tambien arrays y listas
        // pero hay otros que la notacion de array y lista es la misma
        // y la forma de acceder a la posicion es diferente
        // Si vamos a programar en C, usar arrays.
        // Puede haber challenges de java que sea trabajo con arrays.
        // y cada lenguaje tiene sus particularidades
        // en Java los string son objetos, por lo cual para compararlos se usa el .equals
        // otros lenguajes con el == es suficiente.

        System.out.println("Entonces... Listas > Arrays/Vectores");

    }
}