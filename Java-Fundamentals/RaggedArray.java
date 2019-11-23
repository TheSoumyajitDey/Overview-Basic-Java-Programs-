class RaggedArray{

	public static void main (String s[])
	{
	int j,i;
	int rider[][]=new int[7][];
	rider[0]=new int[10];	
	rider[1]=new int[10];
	rider[2]=new int[10];
	rider[3]=new int[10];
	rider[4]=new int[10];
	rider[5]=new int[2];
	rider[6]=new int[2];
	
	for(i=0;i<5;i++)
		for(j=0;j<10;j++)
			rider[i][j]=i+j+10;
       for( i=5;i<7;i++)
		for(j=0;j<2;j++)
			rider[i][j]=i+j+10;
	System.out.println("Rider's per trip during the week");
	for(i=0;i<5;i++)
		for(j=0;j<10;j++)
			System.out.print(rider[i][j]+" ");
	System.out.println();
	}
        System.out.println("Rider's per trip during the weekend");
	for(i=5;i<7;i++){
		for(j=0;j<2;j++)
			System.out.print(rider[i][j]+" ");
	System.out.println();
	}
	}

}