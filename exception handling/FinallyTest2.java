
// when exception occur in try block 
class FinallyTest2 
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
		
		finally
		{ 
			System.out.println("finally block executed"); 
		} 
		
		// rest program will not execute 
		System.out.println("Outside try-finally clause"); 
	} 
} 
