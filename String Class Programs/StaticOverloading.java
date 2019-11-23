class abc
 {
	public static void main(String args[])
	{
	StaticOverloading obj=new StaticOverloading();
        obj.add(10,20);
        obj.add(10.5f,20);
	}
}

class StaticOverloading{

	public static void  add(int a, int b){
		System.out.println("sum="+(a+b));
        }
        public static void add(float a, int b){
		System.out.println("sumf="+(a+b));
        }


}

