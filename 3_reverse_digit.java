 import java.util.Scanner;
public class ReverseNumberExample 
{

    public static void main(String args[]) 
    {
        int number = new Scanner(System.in).nextInt();
     
        int reverse = reverse(number);
        System.out.println("Reverse of number: " + number + " is " + reverse(number));  
   
    }
    public static int reverse(int number){
        int reverse = 0;
        int remainder = 0;
        do{
            remainder = number%10;
            reverse = reverse*10 + remainder;
            number = number/10;
         
        }
        while(number > 0);
     
        return reverse;
    }

}
