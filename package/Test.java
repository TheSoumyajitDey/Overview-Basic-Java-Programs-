import static java.lang.System.*;//static import
import cse3a.*;
import cse3b.*;
public class Test{
public static void main(String...args){
SubClassInDifferentPackage obj=new SubClassInDifferentPackage();
obj.printVar();

SubClassInSamePackage obj1=new SubClassInSamePackage();
obj1.printVar();
out.println("HELLO");
}

}
