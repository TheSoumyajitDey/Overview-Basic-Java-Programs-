class A{

	   A(){

		System.out.println("We are in class A");
         }
}
class B extends A{

	B(){

		System.out.println("We are in class B");
         }
}
class C extends B{

	C(){

		System.out.println("We are in class C");
         }
}
class ConstructorTest{
   	public static void main(String arg[])
    	{
		C c=new C();
         }
}