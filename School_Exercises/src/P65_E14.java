import java.util.Scanner;

public class P65_E14 {

	static Scanner scanner = new Scanner(System.in);
	static double degreeF, degreeC;
	
	public static void main(String[] args) {
		System.out.print("Enter the temperature in fahrenheit: ");
		degreeF = scanner.nextDouble();
		
		degreeC = (double) 5/9 * (degreeF - 32);
		
		System.out.printf("The temperature is: %.2f degrees celsius", degreeC);
	}
}
