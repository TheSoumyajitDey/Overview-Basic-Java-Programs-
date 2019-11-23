package cse3a;
public class NonSubClassInSamePackage 
{
	OriginalClass obj = new OriginalClass();
	void printVar()
	{
	//	System.out.println(obj.privateVar); 	//ERROR
		System.out.println(obj.protectedVar); 	
		System.out.println(obj.friendlyVar);
		System.out.println(obj.publicVar);
	}
}

