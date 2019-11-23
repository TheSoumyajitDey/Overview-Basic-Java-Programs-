class Circle {

      private double x, y; // centre of the circle
      private double radius;    // radius of circle
      public  void getData(double x1,double y1,double r) { 
			
					x=x1;
					y=y1;
					radius=r;
      }
     
      public double caculateCircumference() { 
	   double cf=2*3.14*radius;
		return cf;
      }
      public double calculateArea() { 
		return 3.14 * radius* radius; 
     }
}

class CircleTest
{
        public static void main(String args[])
        {
                  // creating reference
				Scanner ob=new Scanner(System.in);
				double x=ob.nextDouble();
				double y=ob.nextDouble();
				double rad=ob.nextDouble();
			     Circle aCircle = new Circle(); // 
                   aCircle.getData(x,y,rad);
                double area = aCircle.calculateArea(); // invoking method
                double circumf = aCircle.caculateCircumference();
                System.out.println("Area="+area);
                System.out.println("Circumference ="+circumf);
        }
}
