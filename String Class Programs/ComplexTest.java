class ComplexTest{
	public static void main( String s[]){
		Complex c1=new Complex(10,20);
		Complex c2=new Complex(30,40);
                Complex c=c1.addComplex(c2);
                c.display();                

	}

}

class Complex{

private int real,img;
public Complex(int real, int img)
{
this.real=real;
this.img=img;
}

public void display()
{
//static int p;
System.out.println(real+"+i"+img);
}

public Complex addComplex(Complex c)
{
   Complex temp=new Complex(c.real+real,c.img+img);
   return temp;
}

}

