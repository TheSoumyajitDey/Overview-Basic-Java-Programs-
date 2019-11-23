import java.util.Scanner;

class Car

{

          private static int ctr;

          private  static int ctr_tax=0; 

          public Car()

          {
                    ctr++;
          }

          public static int tax(int a)

          {
               if(a==2)    
					ctr_tax++;
               return ctr_tax;
          }
          
          public  int getCarCount(){
             return ctr;

          }
}
   
class TollboothTest

          {
 
          public static void main(String arg[])

          {

          Scanner obj=new Scanner(System.in);
          int non=0;
          int ans=0,pass=0;
          System.out.println("Press 1 if u want to pass a Car any other number to stop passing the car ");
          pass=obj.nextInt();
          Car c=null;
	     while(pass==1)
          {
          c=new Car();
         
          System.out.println("Press 2 if u want to pay tax ");

          ans=obj.nextInt();

          non=c.tax(ans);

          System.out.println("Press 1 if u want to pass a Car any other number to stop passing the car");

          pass=obj.nextInt();

          }

         
          System.out.println("Total no. of cars passed by: "+c.getCarCount());
        
          System.out.println("No. of cars which have paid tax: "+non); 

          int amt=non*50;

          System.out.println("Amount of cash collected: "+amt);

          }
}