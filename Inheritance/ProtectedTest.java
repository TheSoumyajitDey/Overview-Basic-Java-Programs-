class A{

    protected int a;

}
class B extends A{

	protected int b;

       

}

class C extends B{
         public C(int a, int b){
        	this.a=a;
                this.b=b;
        }
       
	public void display(){
           System.out.println("a="+a+"b="+b);
        }
}

class ProtectedTest{

	public static void main(String s[]){
		         C ob=new C(40,20);
                          ob.display();
        }
}		