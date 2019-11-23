package cse3a;
public class SubClassInSamePackage extends OriginalClass
{
	public void printVar()
	{
		//System.out.println(privateVar);	//ERROR
		System.out.println(protectedVar);
		System.out.println(friendlyVar);
		System.out.println(publicVar);
	}
}

