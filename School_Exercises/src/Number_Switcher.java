import java.util.Scanner;

public class Number_Switcher {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		
		int num, n = 0, d;
		
		System.out.print("Enter a number: ");
		
		num = reader.nextInt();
		
		while(num > 0) {
			d = num % 10;
			n = n*10 + d;
			num /= 10;
		}
		
		System.out.println(n);
		}

}
