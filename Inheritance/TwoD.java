abstract class TwoD {
protected int dim1;
protected int dim2;
public TwoD(int dim1,int dim2){
this.dim1 = dim1;
this.dim2 = dim2;
}
public abstract void calArea();
public  abstract void calPeri();
}

class Circle extends TwoD{

 public Circle(int radius){
 super(radius,radius);
 
 }
  
 public void calArea(){
  double area = dim1*3.14*dim2;  
} 

public  void calPeri(){
double peri = 2*3.14*dim1;
}
}
class Driver{
public static void main(Strings [] args){

Circle c = new Circle(10);
c.calArea();
c.calPeri();
}
}