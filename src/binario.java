public class binario {
public static void main(String[] args) {

    String binary = "";

    int x = 4;

        while(x > 0) {

            binary = (x % 2) + binary;

            x /= 2;

        }

        System.out.println(x);

        System.out.println(binary);
    }
}
