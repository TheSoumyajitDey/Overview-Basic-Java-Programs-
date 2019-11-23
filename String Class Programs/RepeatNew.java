import java.util.*;
public class RepeatNew {

	public static void main(String[] args)
	{
		String str=null;
		 Scanner ob=new Scanner(System.in);
		System.out.println ("Enter a String");
         str=ob.nextLine();
		boolean state =check(str.toUpperCase());
		if(state==true)
			System.out.println("Character Repeatation exists");
		else
			System.out.println("Character Repeatation  does not exist");
	}
	public static boolean check(String s1)
	{
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					return true;
				}					
			}	
		}
		return false;
	}
	
	

	

}
