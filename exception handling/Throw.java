import java.util.*;
class ThrowTest
{
	public static void main(String args[])
	{
		int age=0;		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age.....\n");
		age=s.nextInt();
		try                                                         
		{			
			
			if(age >0 && age<18)
				System.out.println("You are a Minor...\n");
			else if (age>=18 && age<=100)				
				System.out.println("You are an Adult....\n");
			else 
				throw new MyArithmeticException();			
		}
		
		catch(MyArithmeticException ie)                              
		{			
			System.out.println(ie);
		}
		
		
	}
}


class MyArithmeticException extends Exception{

public String toString()
{

return "MyArithmeticException:Invalid Age" ;

}
}
