interface TestInterface
{
// abstract method
void square (int a);
// static method
 static void show()
{
System.out.println("Static Method Executed");
}
default void show1()
{
	System.out.println("Hello");
}
}
