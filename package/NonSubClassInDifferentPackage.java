package cse3b;
import cse3a.OriginalClass;

public class NonSubClassInDifferentPackage 
{
	OriginalClass obj = new OriginalClass();
	void printVar()
	{
		//System.out.println(obj.privateVar); 	//ERROR
              //  System.out.println(obj.protectedVar);   //ERROR
             //   System.out.println(obj.friendlyVar);    //ERROR
		System.out.println(obj.publicVar);
	}
}

