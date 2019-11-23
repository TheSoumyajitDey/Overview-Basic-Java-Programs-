public class Regular extends Typist
{
	private int remuneration;
	Regular(int code, String name,int speed,int remuneration)
	{
		super(code, name,speed);
		this.remuneration=remuneration;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Remuneration : "+remuneration);
	}
}