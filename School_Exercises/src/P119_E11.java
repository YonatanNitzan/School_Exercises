import java.util.Scanner;

public class P119_E11 {

	public static void main(String[] args) {
		int grades[][] = new int[10][10];
		int[] ids = new int[10];
		int id;
		int grade;
		int sc = 0;
		int gc = 0;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		do
		{
			System.out.print("Enter I.D.: ");
			id = s.nextInt();
			if(id==0)
				break;
			do
			{
				System.out.print("Enter grade: ");
				grade = s.nextInt();
				if(grade==999)
					break;
				grades[sc][gc] = grade;
				gc++;
			}while(true);
			sc++;
		}while(true);
		
		int j = 0;
		for(int i=0; i<10; i++)
		{
			System.out.print(grades[i][j] + ", ");
			j++;
		}
	}
}