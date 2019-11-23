import java.util.*;
import java.io.*;
class ThrowsDemo
{
	
	 void throwsExample()throws ArithmeticException
	{
		System.out.println("Inside throwsExample.");
		Random r=new Random();
		int a, b, c;
		a=r.nextInt(100);
		b=r.nextInt(50);
		c = a/b;
		System.out.println("c = "+c);		
	}
	
	
	public  void input() 
	{
		int age;		
		//Scanner s = new Scanner(System.in);
		System.out.println("Enter your age.....\n");
		
		try                                                         
		{			
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			age=Integer.parseInt(br.readLine());
			if(age >0 && age<18)
				System.out.println("You are a Minor...\n");
			else if (age>=18 && age<=100)				
				System.out.println("You are an Adult....\n");
			else 
				throw new ArithmeticException();			
		}
		
		catch(ArithmeticException ie)                              
		{			
			System.out.println(ie);
		}
		
			catch(IOException ie)                              
		{			
			System.out.println(ie);
		}
		
	}
}

class ExceptionTest{
	public static void main(String args[])
	{
		int d=5;
		int a1[]={2,3};
		ThrowsDemo obj=new ThrowsDemo();
		obj.input();
		try
		{
				int l=args.length;
				int f=d/l;
				System.out.println(a1[l]);	
				
				
				obj.throwsExample();
			
		
			
		}
	catch(Exception a)
		{
            a.printStackTrace();
		}
		
		System.out.println("Hi HI");
	}
}




	
