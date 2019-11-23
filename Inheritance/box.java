package threedobjpkg;
 public class Box extends ThreeDObject
  {
  public Box(int l,int b,int w)
  {
  super(l,b,w);
  }
   public void wholeSurfaceArea()
  {
  int area=2*(dim1*dim2+dim2*dim3+dim3*dim1);
  
  }
  public void volume()
  {
  int vol=dim1*dim2*dim3;
  }
  }
  