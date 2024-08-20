import java.util.Scanner;
public class Practice1
  {
     public static void main(String[] args)
     {
       Scanner input=new Scanner(System.in);
       System.out.print("Enter first integer:");
       int value1 = input.nextInt();
       System.out.print("Enter second integer:");
       int value2 = input.nextInt();
       
       int length = value1 * value1 / 2 * value2 ;
       System.out.printf("Length is %d%n", length);
      }
   }