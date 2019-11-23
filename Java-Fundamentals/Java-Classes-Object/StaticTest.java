class StaticExample{

	     private int x;
        private static int y;
        public StaticExample(int x){
		this.x=x;
		y++;
               
        }
	
        public static void display()
	{
		System.out.println("y="+y);
        }
        static{
            System.out.println ("Hello");
         }

}

class StaticTest{
	public static void main(String args[])
	{
         	StaticExample ob1=new StaticExample(10);
                StaticExample ob2=new StaticExample(20);
         	//System.out.println("y="+StaticExample.y);
		StaticExample.display();
		StaticExample.display();
	}
}