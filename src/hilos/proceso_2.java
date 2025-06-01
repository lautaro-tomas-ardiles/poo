package hilos;

public class proceso_2 extends Thread{

    @Override
    public void run(){

        double x = 0.0;
        for (int i = 0; i < Integer.MAX_VALUE ; i++) {
            x = Math.sqrt(i);
        }
        System.out.println("final" + x);

    }
}