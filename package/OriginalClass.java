
package cse3a ;


public class OriginalClass
{
	private int privateVar;
	protected int protectedVar;
	int friendlyVar;
	public int publicVar;

	public OriginalClass()
        {
	    privateVar=10;
	    protectedVar=20;
        friendlyVar=30;
        publicVar=40;

        }
	public void printVar()
	{
		System.out.println(privateVar);
		System.out.println(protectedVar);
		System.out.println(friendlyVar);
		System.out.println(publicVar);
	}
}





