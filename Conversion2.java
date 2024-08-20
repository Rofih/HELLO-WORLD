import java.util.Scanner;
public class Conversion2
  {
     public static void main(String[] args)
     {
       Scanner input=new Scanner(System.in);
       System.out.print("Enter first integer:");
       int value1 = input.nextInt();
       System.out.print("Enter second double:");
       int value2 = input.nextInt();
       int value2=0.454;
       int cost = value1 / value2 ;
       System.out.printf("Cost is %d%n", cost);
      }
   }