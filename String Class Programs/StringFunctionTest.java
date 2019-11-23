class StringFunctionTest{

public static void main(String s[])
{
int alpha=0;
char arr[]={'J','A','V','A'};
String s5=new String(arr);
String s2=new String(arr,1,3);
System.out.println(s2);

String s1=new String("I LOVE UEM");
System.out.println(s1.length());
System.out.println(s1.toLowerCase());
System.out.println(s1);
System.out.println("Diff"+s1.compareToIgnoreCase(s2));
System.out.println(s1.charAt(0));
System.out.println(s1.trim());
System.out.println(s1.substring(1,4));
System.out.println(s1);
System.out.println(s1.indexOf('E'));
System.out.println(" Index of LO is"+s1.indexOf("LOVE"));
System.out.println(s1.replace('O','P'));
System.out.println(s1.replace("UE","Coffee"));
System.out.println("Substring is:"+s1.substring(1,4));
s1=s1.substring(1,8);
System.out.println(s1);
//System.out.println(a11);
System.out.println(s1.concat("Programming Language"));
char a[]=s1.toCharArray();
for(int i=0;i<a.length;i++)
{
  if((a[i]>='a' && a[i]<='z') || (a[i]>='A' && a[i]<='Z'))
     alpha++;
}
System.out.println(alpha);
}

}

