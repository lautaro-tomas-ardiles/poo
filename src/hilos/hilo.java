package hilos;

public class hilo {
    public static void main(String[] args) {

        proceso_1 a = new proceso_1();

        proceso_2 b = new proceso_2();

        a.start();

        b.start();

    }
}
