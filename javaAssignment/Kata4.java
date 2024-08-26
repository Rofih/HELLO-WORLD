import java.util.Scanner;
public class Kata4{
   public static void main(int value){
      int value=input.nextInt();
     palindrome(value);










}
}








public class Palindrome{
   public static void palindrome(int value){
       Scanner input=new Scanner(System.in);
       System.out.print("Enter a number:");
        int value=input.nextInt();
         int number=value;
         int value1=number%10;
         int value2=number%100;
         int value3=number/10;
         int value4=value3%100;
         int value5=value3/100;
      if(value1==value5)
        {System.out.print("it is a palindrome            ");        }
      if(value1!=value5)
        {System.out.print("it is not a palindrome            ");        }

              }






           }

