
import threedobjpkg.*;

public class  ThreeDObjectTest{
	  public static void main(String s[]){
		
		ThreeDObject obj=null;
		
		obj = new Box(1,2,3);
		
		obj.wholeSurfaceArea();
		obj.volume();
		obj=new Cube(8);
		
		obj.wholeSurfaceArea();
		obj.volume();
		}
		
	  
}