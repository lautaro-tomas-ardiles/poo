import java.util.Scanner;
public class comvertidor_binario  {

    public static class Converter {

        public static String toBinary(int x){

            String binary = "";

            while(x > 0) {

                binary = (x % 2) + binary;

                x /= 2;
            }
            return binary;
        }
    }

    public static void main(String[ ] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.print(Converter.toBinary(x));

    }
}