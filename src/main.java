import java.util.Scanner;
public class main {
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int n = read.nextInt(), m = read.nextInt();

		Income income = new Income();
		income.totalIncome = n;
		income.taxPercent = m;

		income.CalculateNetRevenue();
		System.out.println("Net revenue: " + income.getNetRevenue());

	}
}
class Income{

	private int netRevenue;
    public int totalIncome;
    public int taxPercent;

    public void CalculateNetRevenue(){
    	netRevenue = totalIncome - totalIncome * taxPercent / 100   ;
    }

    public int getNetRevenue(){
        return netRevenue;
    }
}