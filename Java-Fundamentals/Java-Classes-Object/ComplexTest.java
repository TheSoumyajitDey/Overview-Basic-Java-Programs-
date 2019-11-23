class ComplexTest{
	public static void main( String s[]){
		Complex c1=new Complex(10,20);
		Complex c2=new Complex(30,40);
        Complex c=c1.addComplex(c2);
		Complex c3=new Complex(10,20);
		Complex c4=new Complex(50,40);
    	Complex  c5=c3.addComplex(c4);
         c.display();                
		 c5.display();
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

public Complex addComplex(Complex cnew)
{
   Complex temp=new Complex(0,0);
   temp.real=cnew.real+real;
   temp.img=cnew.img+img;
   return temp;
}

}

