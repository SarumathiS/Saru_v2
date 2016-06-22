import java.lang.*;

public class StringDemo {

   public static void main(String[] args) {
  
   String str1 = "tutorials point", str2 = "http://";

   CharSequence cs1 = "int";
   boolean retval = str1.contains(cs1);
   System.out.println("Method returns : " + retval);
   retval = str2.contains("_");   
   System.out.println("Methods returns: " + retval);
   }
}
