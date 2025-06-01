package hilos;

public class hilo {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();

        proceso_1 a = new proceso_1();
        proceso_2 b = new proceso_2();

        a.start();
        b.start();

        // Esperar a que ambos hilos terminen
        try {
            a.join();
            b.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long fina = System.currentTimeMillis();
        System.out.println("Tiempo total: " + (fina - inicio) + " ms");
    }
}