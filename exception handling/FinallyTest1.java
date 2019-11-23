class FinallyTest1 
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
		catch(NullPointerException ex) 
		{ 
			System.out.println("Exception has been caught"); 
		} 
		 finally
        { 
            System.out.println("finally block executed"); 
        } 
          
		System.out.println("Outside try-catch clause"); 
	} 
} 
