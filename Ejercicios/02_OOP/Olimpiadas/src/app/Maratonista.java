package app;

/**
 * Maratonista
 */
public class Maratonista extends Deportista {

    public String categoria;
    public String marca;
    public int velocidadActual;
    public int kmsRecorridos;
    public int energia;

    public EstadoEnum estado;

    public enum EstadoEnum {
        Corriendo,
        Trotando,
        Parado,
        Infartado,
        Arrastrandose
    }

    public boolean correr() {

        if(this.energia > 0)
        {
            this.estado = EstadoEnum.Corriendo;
            this.velocidadActual = 20; //velocidad constante de 20km
            this.energia -= 5; // this.energia = this.energica - 10;
            this.playAnimacionCorrer();
            return true;
        }
        else {
            this.estado = EstadoEnum.Arrastrandose;
            return false;
        }
            //System.out.println("Ok, empece a correr.");
    }

    public void acelerar() {
        System.out.println("Acelerando...");
        this.velocidadActual++;
    }



    public void playAnimacionLargada() {
        for (int i = 3; i > 0; i--) {

            System.out.print(i);
            System.out.print("\r");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("lalalal");
    }

    public void playAnimacionCorrer() {

        System.out.print("\r");
        String blancos = "";
        for (int i = 100; i > energia; i--) {

            blancos += " ";

        }
        String cuerpo = "\\o/";

        if (this.energia % 2 != 0)
            cuerpo = "/o\\";

        System.out.print(blancos + cuerpo);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}