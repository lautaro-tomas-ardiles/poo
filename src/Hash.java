import java.util.HashMap;

public class Hash {
    public static void main (String args[] ){

        HashMap <Integer, String> map = new HashMap<>();

        map.put(1,"hola");

        map.put(2,"que onda");

        map.put(3,"chau");

        System.out.println(map.get (3));


        //para correr el hash estan estas formas


         //1
        for ( int i = 1; i < 4; i++ ){
            System.out.println (map.get (i));
        }

         //2
        System.out.println(map.get (0));

        System.out.println(map.get (1));

        System.out.println(map.get (2));

        //3
        System.out.println(map);

    }
}
