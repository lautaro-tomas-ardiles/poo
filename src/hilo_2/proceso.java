package hilo_2;

public class proceso extends Thread{

    @Override
    public void run(){

        for (int i = 0 ; i <= 5 ; i++){
            System.out.println(i);
        }

    }
}