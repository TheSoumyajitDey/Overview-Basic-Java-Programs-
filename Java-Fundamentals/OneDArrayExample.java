import java.util.Scanner;

public class OneDArrayExample
{
   public static void main(String args[])
   {
       int large, size, i;
       
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter Array Size : ");
       size = scan.nextInt();
       int arr[];
        arr = new int[size];   
       int arr_new[] = new int[size];  
       System.out.print("Enter Array Elements : ");
       for(i=0; i<size; i++)
       {
           arr[i] = scan.nextInt();
       }
      arr_new=arr;

      System.out.print("The new Array is....\n\n"); 
      for(i=0; i<size; i++)
       {
          System.out.println(arr_new[i]);
       }  
       System.out.print("Searching for the Largest Number....\n\n");
	   
       large = arr[0];
	   
       for(int value:arr)
       {
           if(large < value)
           {
               large = value;
           }
           
       }
	   
       System.out.print("Largest Number = " +large); 
   }
}