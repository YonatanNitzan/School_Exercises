package classes;

public class CallClass {

	public static void main(String[] args) {
		Man m1 = new Man();
		m1.setAtributes("Eetzik", "Zahavi", 42069666);
		System.out.println(m1.getAtributes());
		System.out.println(m1.run(0, 0, 100, 100));
		System.out.println(m1.sayName());
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println(m1.tipTop());
			try {
				Thread.sleep(333);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		m1.scream(500);
	}

}
