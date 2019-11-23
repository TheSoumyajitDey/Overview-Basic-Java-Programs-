package cse3b;
import cse3a.OriginalClass;
public class SubClassInDifferentPackage extends OriginalClass
{
	public void printVar()
	{
               // System.out.println(privateVar); //ERROR
		System.out.println(protectedVar);
	//	System.out.println(friendlyVar);
		System.out.println(publicVar);
	}
}

