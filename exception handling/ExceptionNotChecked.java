class ExceptionNotChecked
{
	public static void main(String args[])
	{
		
		int num[]={10,20,30,40,78,50,11};
		int denom[]={1,0,10,5},i;
		System.out.println("finding num/denom");
		for(i=0;i<num.length;i++){
			
				System.out.println(num[i]+"/"+denom[i]+"="+num[i]/denom[i]);
			     System.out.println("No Exception");
			
		}
		
		
		System.out.println("Thankyou");
	}
}