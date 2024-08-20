import java.util.Scanner;
public class Sum1
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
       System.out.print("Enter fifth integer:");
       int value5 = input.nextInt();
       System.out.print("Enter sixth integer:");
       int value6 = input.nextInt();
       System.out.print("Enter seventh integer:");
       int value7 = input.nextInt();
       System.out.print("Enter eighth integer:");
       int value8 = input.nextInt();
       System.out.print("Enter ninth integer:");
       int value9 = input.nextInt();
       System.out.print("Enter tenth integer:");
       int value10 = input.nextInt();
       int sum = value1 + value2 + value3 + value4 + value5 + value6 + value7 + value8 + value9 +value10;
       System.out.printf("Sum is %d%n", sum);
      }
   }