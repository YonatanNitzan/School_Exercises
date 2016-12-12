import java.util.Scanner;

public class P65_E16 {

	static Scanner scanner = new Scanner(System.in);
	static double ageY, ageD, ageM, ageS;
	
	public static void main(String[] args) {
		System.out.print("Enter your age: ");
		ageY = scanner.nextDouble();
		
		ageD = ageY*365;
		ageM = ageD*60*24;
		ageS = ageM*60;
		
		
		System.out.printf("\nYou lived:\n%.2f days\nor", ageD);
		System.out.printf("\n%.2f minutes\nor", ageM);
		System.out.printf("\n%.2f seconds;", ageS);
	}
}
