import java.util.Scanner;
public class Palindrome{
   public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       System.out.print("Enter a number:");
        int value=input.nextInt();
         int number=value;
         int value1=number%10;
         int value2=number/10;
         int value3=value2%10;
         int value4=value2/10;
    
      if(value1==value4)
        {System.out.print("it is a palindrome            ");        }
      if(value1!=value4)
        {System.out.print("it is not a palindrome            ");        }

              }






           }


















                  
