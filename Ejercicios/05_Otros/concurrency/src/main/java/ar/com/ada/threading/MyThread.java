package ar.com.ada.threading;

class MyThread implements Runnable {

    String name;

    Thread t;

    public MyThread(String thread) {

        name = thread;

        t = new Thread(this, name);

        System.out.println("New thread: " + t);

        // Aca da inicio a que se ejecute el Thread del objeto MyThread
        // por lo tanto corriendo el metodo "run(implimentado por la interface)"
        t.start();

    }

    public void run() {

        try {

            System.out.println("Yo, " + this.name + " Voy a imprimir de 5 a 1");
            for (int i = 5; i > 0; i--) {

                System.out.println(name + "(Async): " + i);

                // se duerme 1000 milisegundos (ms)= > 1 segundo
                Thread.sleep(1000);

            }

        } catch (InterruptedException e) {

            System.out.println(name + "Interrupted");

        }

        System.out.println(name + " exiting.");

    }

}