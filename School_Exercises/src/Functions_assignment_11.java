import java.util.Scanner;

public class Functions_assignment_11 {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		int timeEx1, timeEx2;
		
		System.out.println("Enter a time expression as a 3-4 diggit number: (Example: 2108 will be 21 minutes and 8 seconds)");
		timeEx1 = reader.nextInt();
		
		System.out.println("Enter a second time expression: ");
		timeEx2 = reader.nextInt();
		
		System.out.println("The difference (in seconds) is: " + diffInSec(timeEx1, timeEx2) + "s");
	}
	
	private static int diffInSec(int time1, int time2)
	{
		int diff, min1, sec1, min2, sec2;
		
		min1 = time1/100;
		sec1 = time1%100 + min1*60;
		
		min2 = time2/100;
		sec2 = time2%100 + min2*60;
		
		diff = Math.abs(sec1 - sec2);
		
		return diff;
	}
}