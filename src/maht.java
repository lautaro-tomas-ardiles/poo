import java.util.Scanner;

public class maht {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String t;
        int num_1, num_2;

        System.out.print("desea que se devuelva el numero mayor o menor : ");
        t = in.nextLine();

        System.out.print("primer numero : ");
        num_1 = in.nextInt();

        System.out.print("segundo numero : ");
        num_2 = in.nextInt();

        if (t.equals( "mayor" ) ){

            int mayor = Math.max(num_1 , num_2);

            System.out.println("de los numeros el mayor es : " + mayor);

        } else if (t.equals( "menor" ) ){

            int menor = Math.min(num_1 , num_2);

            System.out.println("de los numeros el menor es : " + menor);

        }else {
            System.out.println("las unicas opciones ¨mayor¨ o ¨menor¨");
        }
    }
}