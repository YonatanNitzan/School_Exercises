public class Given_Output {

	public static void main(String[] args) {
		System.out.println("1:\n");
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("$ ");
			}
			System.out.println();
		}
		
		System.out.println("\n2:\n");
		
		System.out.print("  ");
		for (int i = 4; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("$ ");
			}
			System.out.println();
		}
		
		System.out.println("\n3:\n");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n4:\n");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
