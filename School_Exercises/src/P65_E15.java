import java.util.Scanner;

public class P65_E15 {

	static Scanner scanner = new Scanner(System.in);
	static double dayR, nightR, shabatR, income;
	
	public static void main(String[] args) {
		System.out.print("Enter the day rate: ");
		dayR = scanner.nextDouble();
		
		nightR = dayR*1.5;
		shabatR = dayR*2;
		
		System.out.print("\nEnter the amount of day hours you work: ");
		income += scanner.nextDouble()*dayR;
		System.out.print("Enter the amount of night hours you work: ");
		income += scanner.nextDouble()*nightR;
		System.out.print("Enter the amount of Shabat hours you work: ");
		income += scanner.nextDouble()*shabatR;
		
		System.out.printf("\nYour income is: %.2f ILS", income);
	}
}
