package app;

public class Tema {
    public String nombre;
    public int duracion;

    public void comenzar(){
        System.out.println("Ahora vamos a tocar el tema " + this.nombre);
    }
}