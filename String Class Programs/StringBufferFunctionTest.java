class StringBufferFunctionTest{

public static void main(String s[])
{
StringBuffer s1=new StringBuffer("I Love Java");
System.out.println(s1.length());
System.out.println(s1.capacity());
s1.ensureCapacity(50);
System.out.println(s1.capacity());
System.out.println(s1);
s1.delete(7,11);
System.out.println(s1);
s1.insert(7,"UEM");
System.out.println(s1);
s1.reverse();
System.out.println(s1);
System.out.println(s1.append("Programming Language"));
//System.out.println(s1.replace("La", "Coffee"));
System.out.println(s1.replace(2, 12, "Coffee"));
System.out.println(s1.substring(5,8));
System.out.println(s1);
StringBuffer s3=new StringBuffer("Hello");
System.out.println(s3.length());
s3.insert(3,"XYZ");
s3.setCharAt(5,'V');
System.out.println(s3);
String s2=s1.insert(5,'Q').toString();
System.out.println(s2);

}
}

