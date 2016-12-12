import java.util.Scanner;

public class Teaching_Noam {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		String inputString;
		int inputInt;
		
		System.out.print("Enter something: ");
		inputString = reader.next();
		
		System.out.print("Enter something: ");
		inputInt = reader.nextInt();
		
		System.out.println("The string you asked for +! is: " + inputString + "! *boop*");
		System.out.println("The number you wantet +3 is: " + (inputInt+3));
		
	}
}