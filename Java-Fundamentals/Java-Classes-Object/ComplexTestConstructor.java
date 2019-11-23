class Complex{

private int real,img;
public Complex(int r, int i)
{
	real=r;
	img=i;
}
public Complex(int r)
{
	real=r;
	img=20;
}

public Complex(Complex c5)
{
   real=c5.real;
   img=c5.img;
}

public Complex()
{
   real=10;
   img=20;
}

public void display()
{
System.out.println(real+"+i"+img);
}


}

class ComplexTestConstructor{
	public static void main( String s[]){
		Complex c1=new Complex(10,20);
		Complex c2=new Complex(-30,-40);
		Complex c3=new Complex();
        Complex c=new Complex(c2);
		Complex c4=new Complex(50);
		 c1.display();
		 c2.display();
         c3.display();
         c4.display();		 
         c.display();               

	}

}
