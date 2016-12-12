import java.util.Scanner;

public class P65_E12 {

	static Scanner scanner = new Scanner(System.in);
	static double side, hight, circumf, area;
	
	public static void main(String[] args) {
		System.out.print("Enter the length of the triangle's sides: ");
		side = scanner.nextDouble();
		
		System.out.print("Enter the triangle's hight: ");
		hight = scanner.nextDouble();

		area = (side * hight)/2;
		circumf = side * 3;
		
		System.out.println("The area of the triangle is: " + area);
		System.out.println("The circumference of the triangle is: " + circumf);
	}
}
