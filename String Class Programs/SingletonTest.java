class Singleton
{
    private static Singleton single_instance = null;
    
    public String s;
    int a,b;
    private Singleton(int a, int b)
    {
        
	this.a=a;
	this.b=b;
	s = "Hello I am a string part of Singleton class";
    }
    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton(10,20);
 
        return single_instance;
    }

    }

	public void display()
	{
	System.out.println("a="+a+"b="+b);
	}
}
class SingletonTest
{
    public static void main(String args[])
    {
       
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();
        x.s = (x.s).toUpperCase();
 	x.display();
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");
 
        
    }
}


