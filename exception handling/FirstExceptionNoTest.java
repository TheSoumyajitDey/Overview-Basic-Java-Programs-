
import java.io.*;
class FirstExceptionNoTest
{ 
	public static void main (String[] args) throws IOException
	{ 
		
		// array of size 4. 
		int[] arr = {1,2,3,4};
	
		int i = arr[4]; 
				
		
		System.out.println(" Unchecked Exception "); 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int age=Integer.parseInt(br.readLine());
		System.out.println("Outside try-catch clause"); 
		
		
	} 
} 
