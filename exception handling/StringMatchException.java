import java.util.*;
class NoMatchException extends Exception{

public String toString()
{

return "NoMatchException:String is not University" ;

}
}

class TestException{

public static void main(String args[])
{


System.out.println("Enter a String");
Scanner obj=new Scanner(System.in);
String s=obj.nextLine();
try{
if (s.equalsIgnoreCase("University"))

  System.out.println("Ok");

else 
   throw new NoMatchException();

} catch( NoMatchException e){System.out.println(e);}
}
}
