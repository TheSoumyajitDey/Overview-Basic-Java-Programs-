interface A 
{
	int a=10;
	public void show1();
	
}

interface B extends A
{
	int b=20;
	public void show2();
	
}
interface C
{
	int c=30;
	public void show3();
	
}
class Run implements B,C
{
	public void show1()
	{
		System.out.println("Inteface A");
	}
	public void show2()
	{
		System.out.println("Inteface B");
	}
	public void show3()
	{
		System.out.println("Inteface C");
	}
	public static void main(String args[])
	{
		Run r=new Run();
		r.show1();
		r.show2();
		r.show3();
	}
}