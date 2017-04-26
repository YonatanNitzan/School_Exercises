package classes;

public class Man {
	private int id;
	private String s, name, fname;
	
	public String run(int xStart, int yStart, int xEnd, int yEnd)
	{
		s = String.format("Rollin' from (%d;%d) to (%d;%d)", xStart, yStart, xEnd, yEnd);
		return s;
	}

	public String sayName()
	{
		s = String.format("Ello! M'name %s %s", name, this.tipTop());
		return s;	
	}
	
	public String tipTop()
	{
		return "*Tips le tophat*";
	}
	
	public void scream(int delay)
	{
		while(true)
		{
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("AAAAAAAAAAHHHHHHHHH");
		}
	}
	
	public String getAtributes()
	{
		s = String.format("%s, %s\nID: %d", fname, name, id);
		return s;
	}
	
	public void setAtributes(String n, String fn, int id)
	{
		name = n;
		fname = fn;
		this.id = id;
	}
}
