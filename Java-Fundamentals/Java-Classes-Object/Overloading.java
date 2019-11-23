
public class Test
{ 
		public void display()
		{
		System.out.println("We are using a non-para method");
		}
		
		public void display(int b,int c) 
		{
			System.out.println("We are using 2 para method"+b+" "+c);
		}
		
		public void display(int d,int e ,int f)
		{
			System.out.println("We are using 3 para method"+d+" " +e+" "+f);
		}
		
}

public class Driver
{
public static void main(String[] args)
	{
		Test obj=new Test();
		obj.display();
		obj.display(2,4);
		obj.display(5,6,7);
		}
		}
		