import java.util.Scanner;
import java.util.InputMismatchException;

public class chun {
	public static void main(String[] args) {

	    int i;

	    Scanner scanner = new Scanner(System.in);
	    
	    try {
	        
			int num1 = scanner.nextInt();
	        
			int num2 = scanner.nextInt();
	      
		  	i = num1 / num2;

		  	System.out.println(i);

	        //your code goes here
	    } catch(ArithmeticException e) {
	        System.out.println("Еrror: division by zero");
	    } catch(InputMismatchException e){
	        System.out.println("Error: wrong value type");
	    }
	}
}