public class Typist extends Staff
{
private int speed;
public Typist(int code, String name,int speed){
super(code,name);
this.speed=speed;
} 
public void display()
{
//super.display();
System.out.println("speed = "+speed);
}
}