import java.util.Scanner;
public class Energy1
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
       System.out.print("Enter fourth integer:");
       int value4 = input.nextInt();
       int energy = value1 * ( value4 - value2 )* value3;
       System.out.printf("Energy is %d%n", energy);
      }
   } 