import java.util.Scanner;

public class Number_Switcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		
		int d1, d10, d100, d1000, d10000, num, length;
		
		System.out.println("Enter a number: (2 to 5 digits)");
		
		num = reader.nextInt();
		
		length = (int)(Math.log10(num)+1);;
		
		d1 = num%10;
		
		switch(length){
		case 2:
			d10 = (num/10)%10;
			System.out.println("The number is - " + d1 + d10);
			System.out.print("The sum of the digits is - " + (d1 + d10));
			break;
		
		case 3:
			d10 = (num/10)%10;
			d100 = num/100;
			System.out.println("The number is - " + d1 + d10 + d100);
			System.out.print("The sum of the digits is - " + (d1 + d10 + d100));
			break;
		
		case 4:
			d10 = (num/10)%10;
			d100 = (num/100)%10;
			d1000 = num/1000;
			System.out.println("The number is - " + d1 + d10 + d100 + d1000);
			System.out.print("The sum of the digits is - " + (d1 + d10 + d100 + d1000));
			break;
		
		case 5:
			d10 = (num/10)%10;
			d100 = (num/100)%10;
			d1000 = (num/1000)%10;
			d10000 = num/10000;
			System.out.println("The number is - " + d1 + d10 + d100 + d1000 + d10000);
			System.out.print("The sum of the digits is - " + (d1 + d10 + d100 + d1000 + d10000));
			break;

		default:
			System.out.println("That is not a 2 to 5 digit number!");
			break;
		}	
	}

}
