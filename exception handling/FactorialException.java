class FactorialException{

public static void main(String args[]){

int num[]={1,-4,15,20,6,0,31};

long  fact[]=new long[num.length];


for(int i=0;i<num.length;i++){
  fact[i]=fact_cal(num[i]);
  
}
for(int i=0;i<num.length;i++){
   System.out.println(fact[i]);
}
}

public static long  fact_cal( int n)
{
long  f=1;
try{
if( n<0)
	throw new NumberFormatException(); 
else if(n>20)
	throw new IllegalArgumentException();
else{
for(int i=1;i<=n;i++)
	f=f*i;
return f;
}

}
catch( NumberFormatException e)
{
System.out.println("Value of x must be positive");
return 0;
}
catch( IllegalArgumentException e)
{
System.out.println("Value of x must be less than 20");
return 0;
}
}
}

