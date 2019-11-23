import java.util.*;
import java.io.*;
public class Marks
{
public static void main(String s[])
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("ENTER THE MAXIMUM NUMBER OF STUDENTS \n");
	int n=sc.nextInt();
	int a[][]=new int[n][3];
	int b[]=new int[n];
	for(int i=0;i<n;i++)
		{
		System.out.println("ENTER THE MARKS OF ROLL "+(i+1));
		for(int j=0;j<3;j++)
			{
			System.out.println("ENTER THE MARKS OF SUBJECT "+(j+1));
			a[i][j]=sc.nextInt();
			}
		}
	for(int i=0;i<n;i++)
		{
		for(int j=0;j<3;j++)
			b[i]=b[i]+a[i][j];
		}
	int hm=b[0],r=0,rs1=0,rs2=0,rs3=0,hs1=0,hs2=0,hs3=0;
	for(int i=1;i<n;i++)
		{
			if(b[i]>=hm)
				{
				hm=b[i];
				r=i+1;
				}
		}
	hs1=a[0][0];
	hs2=a[0][1];
	hs3=a[0][2];	
	for(int i=0;i<n;i++)
		{
		if(a[i][0]>=hs1)
			{
			 hs1=a[i][0];
			 rs1=i+1;
			 }
		if(a[i][1]>=hs2)
			{
			 hs2=a[i][1];
			 rs2=i+1;
			 }
		if(a[i][2]>=hs3)
			{
			 hs3=a[i][2];
			 rs3=i+1;
			 }	
		}
	System.out.println("TOTAL MARKS OF EACH STUDENT");
	for(int i=0;i<n;i++)
		System.out.println("ROLL "+(i+1)+"MARKS "+b[i]+"\n");
	System.out.println("SUBJECT 1 HIGHEST MARKS "+hs1+" ROLL "+rs1+"\n");
	System.out.println("SUBJECT 2 HIGHEST MARKS "+hs2+" ROLL "+rs2+"\n");
	System.out.println("SUBJECT 3 HIGHEST MARKS "+hs3+" ROLL "+rs3+"\n");	
	System.out.println("HIGHEST TOTAL MARKS "+hm+" ROLL "+r+"\n");
}
}	

