package hilos;

public class test {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        double x = 0.0;

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            x = Math.sqrt(i);
        }
        System.out.println("final " + x);

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            x = Math.sqrt(i);
        }
        System.out.println("final " + x);

        long fina = System.currentTimeMillis();
        System.out.println("Tiempo total: " + (fina - inicio) + " ms");
    }
}
