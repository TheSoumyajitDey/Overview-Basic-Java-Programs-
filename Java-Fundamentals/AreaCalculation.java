		
		import java.util.Scanner;
		class		AreaCalculation{

						public static void main(String S[])
						{
    
								int radius;
								double area;
								System.out.println("Enter the radius of the circle");
								Scanner scan=new Scanner(System.in);
								radius=scan.nextInt();
								area=3.14*radius*radius;
								System.out.println("Area of the Circle is"+area);
	
}
}