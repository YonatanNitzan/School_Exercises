import java.util.Scanner;

public class fuckYou_YouAreWrong {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		/*
		int max = 0, x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		if(x>y)
		{
			max = x;
		}
		System.out.println("Max number=" + max);
		*/
		
		/*
		char digit;
		char x;
		System.out.println("Enter a digit:");
		digit = sc.next().charAt(0);
		if(digit == '0')
			x = '9';
		else
			x = (char)(digit - 1);
		System.out.println(x);
		*/
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		if ((a<b || a < 100) && b > 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
