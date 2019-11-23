import java.util.*;

class ThrowsTest
{
	
	static void throwsExample()throws ArithmeticException
	{
		System.out.println("Inside throwsExample.");
		Random r=new Random();
		int a=0, b=0, c=0;
		a=r.nextInt(10);
		b=r.nextInt(10);
		c = a/b;
		System.out.println("c = "+c);		
	}
	
	public static void main(String args[])
	{
		try
		{
			throwsExample();
			
		}
		catch(ArithmeticException a)
		{
             a.printStackTrace();
		}
	}
}


