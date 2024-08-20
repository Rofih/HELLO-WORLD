import java.util.Scanner;
public class Intrest1
  {
     public static void main(String[] args)
     {
       Scanner input=new Scanner(System.in);
       System.out.print("Enter first integer:");
       int value1 = input.nextInt();
       System.out.print("Enter second integer:");
       int value2 = input.nextInt();
       System.out.print("Enter third integer:");
       int value3 = input.nextInt();
       int intrest = value1 * ( value2 / value3 );
       System.out.printf("Intrest is %d%n", intrest);
      }
   } 