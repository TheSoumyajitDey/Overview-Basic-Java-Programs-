import java.util.Scanner;
public class Run
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values....");
		int code=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		int speed=sc.nextInt();
		int renumeration=sc.nextInt();
		Regular rb=new Regular(code,name,speed,renumeration);
		rb.display();
	}
}