import java.util.Scanner;

public class JavaProgram
{
   public static void main(String args[])
   {
       String str_original, strNew;
       Scanner scan = new Scanner(System.in);
       str_original = scan.nextLine();
       
       System.out.print("Removing Vowels from The String ["+str_original+"]\n");
       strNew = str_original.replaceAll("[aeiouAEIOU]", "");
	   
       System.out.print("All Vowels Removed Successfully!!!!!!!!\n Now the String is :\n");
              
       System.out.print(strNew);
   }
}
