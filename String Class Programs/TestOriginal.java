#include <stdio.h>
int main(int argc,char*argv[])
{
    if(argc<1)
    {
        printf("please enter values");
        return 0;
    }
    else
    {
        int arr[100],i,m,mo,j=0,h[100];

#include <stdio.h>
int main(int argc,char*argv[])
{
    if(argc<1)
    {
        printf("please enter values");
        return 0;
    }
    else
    {
        int arr[100],i,n,m,mo,j=2,h[100];
        for(i=1;i<=argc;i++)
        {
            arr[i-1]=atoi(argv[i]);   
        }
        
       m=high(arr,argc);
        
        for(i=0;i<argc;i++)
        {
            if(arr[i]!=m)
            {
                h[j]=arr[i];
                j++;
            }
        }
        
      
         mo=high(h,j);
         printf("%d",mo);
    }
    

    return 0;
}


int high(int a[],int b)
{
    int i,max;
    max=a[0];
    for(i=0;i<b;i++)
    {
    if(a[i]>max)
    {
        max=a[i];
    }
    }
    return max;
}
