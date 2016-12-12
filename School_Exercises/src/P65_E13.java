import java.util.Scanner;

public class P65_E13 {

	static Scanner scanner = new Scanner(System.in);
	static double exDollarRate, cost;
	
	public static void main(String[] args) {
		System.out.print("Enter the current extange rate of the dollar: ");
		exDollarRate = scanner.nextDouble();
		
		System.out.print("Enter the cost of the trip (in dollars): ");
		cost = scanner.nextDouble();
		
		System.out.println("The total cost of the trip is: " + ((exDollarRate*cost)+400) + " ILS");
	}
}
