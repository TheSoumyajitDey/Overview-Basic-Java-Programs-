class StringCommandLine{

public static void main(String s[])
{

		CountAndPrint obj=new CountAndPrint();
        obj.test(s);
			

}
}

class CountAndPrint{
	
	public void test( String s1[])
	{
		System.out.println("Number of Argument is:"+ s1.length);
        
		for(int i=0;i<s1.length;i++){
			System.out.print(s1[i].charAt(0));
		}
			

		
	}
}