final class A{

	A(){

		System.out.println("We are in class A");
         }
      public void display(){
	System.out.println("We are in class A--Display Method");
      }

}
class B extends A{

	B(){

		System.out.println("We are in class B");
         }
        public void display(){
			System.out.println("We are in class B --Display Method");
      }
	  public void display1(){
			System.out.println("We are in class B --Display1 Method");
      }
}
class C extends B{

	C(){

		System.out.println("We are in class C");
         }
}
class ObjectRefTest{
   	public static void main(String arg[])
    	{
		 A c=new B();
          c.display();
         }
}