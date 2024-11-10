import java.util.ArrayList;
import java.util.Collections;

public class ListArray {
    public static void main(String[] args) {

        ArrayList<Integer> c = new ArrayList<>(5);

        c.add(10);

        c.add(8);

        c.add(2);

        c.add(90);

        c.add(820);

        Collections.sort(c); //lo devuelve de menor a mayor

        //mas opciones

        Collections.min(c);// saca el minimo

        Collections.max(c);// saca el maximo

        Collections.reverse(c);// lo de vuelve alreves

        Collections.shuffle(c);//  lo devuelve de manera aliatorio

        System.out.println(c);

    }
}