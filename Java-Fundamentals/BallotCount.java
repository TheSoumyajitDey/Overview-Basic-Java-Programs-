import java.util.Scanner;
import java.io.*;
class BallotCount{
public static void main (String args[]) throws IOException
{
	int Ballot_count[]=new int[5];
	char ch1;
	Scanner s=new Scanner(System.in);
	do{
		System.out.println("Enter Your Choice...1 to 5");
                int ch=s.nextInt();
		switch(ch)
		{
		 case 1: Ballot_count[0]++;
		 break;
		 case 2: Ballot_count[1]++;
                 break;
		 case 3: Ballot_count[2]++;
		 break;
		 case 4: Ballot_count[3]++;
                 break;
		 case 5: Ballot_count[4]++;
		 break;
		 default: System.out.println("Spoilt Ballot");
                 break;
		 
               }
		System.out.println ("Enter y to continue");
                ch1= (char) System.in.read();
             }while(ch1=='y' || ch1=='Y');
                System.out.println("The ballot count is");
	        for(int value:Ballot_count)
		     System.out.println(value);  
}


}