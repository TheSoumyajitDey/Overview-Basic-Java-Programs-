 package threedobjpkg;

 public class Cube extends ThreeDObject
  {
     public Cube (int side)

	 {
	 super(side,side,side) ;
	 }
	 public void wholeSurfaceArea()
	 {
	  int area = 6*(dim1*dim1);
	  System.out.println("The area of cube" + area);
	  }
	  public void volume()
	  {
	  int vol= dim1*dim1*dim1;
	  System.out.println("The volume is " + vol);
	  }
	  }
	  