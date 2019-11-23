// and handled in catch block 
class FirstExceptionTest
{ 
	public static void main (String[] args) 
	{ 
		
		// array of size 4. 
		int[] arr = {1,2,3,4};
		try
		{ 
			int i = arr[4]; 
				
			System.out.println("Inside try block"); 
		} 
		catch(ArrayIndexOutOfBoundsException ex) 
		{ 
			System.out.println(ex); 
			//ex.printStackTrace();
		} 
		
		// rest program will be excuted 
		System.out.println("Outside try-catch clause"); 
	} 
} 
