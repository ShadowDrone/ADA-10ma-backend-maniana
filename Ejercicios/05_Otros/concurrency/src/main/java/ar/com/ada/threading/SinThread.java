package ar.com.ada.threading;

class SinThread {

    String name;

    public SinThread(String thread) {

        name = thread;

        System.out.println("New thread: " + name);

        // Aca da inicio a que se ejecute el Thread del objeto MyThread
        // por lo tanto corriendo el metodo "run(implimentado por la interface)"
        comenzar();
    }

    public void comenzar() {

        try {

            System.out.println("Yo SIN THREAD, " + this.name + " Voy a imprimir de 5 a 1");
            for (int i = 5; i > 0; i--) {

                System.out.println(name + "(Sync): " + i);

                // se duerme 1000 milisegundos (ms)= > 1 segundo
                Thread.sleep(1000);

            }

        } catch (InterruptedException e) {

            System.out.println(name + "Interrupted");

        }

        System.out.println(name + " exiting.");

    }

}