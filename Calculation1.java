import java.util.Scanner;
public class Calculation1
  {
     public static void main(String[] args)
     {
       Scanner input=new Scanner(System.in);
       System.out.print("Enter first integer:");
       int value1 = input.nextInt();
       System.out.print("Enter second integer:");
       int value2 = input.nextInt();
      
       int area = value2 * value1 ;
       System.out.printf("Area is %d%n", area);
       int perimeter = 2 *(value2 + value1);
       System.out.printf("Perimeter is %d%n", perimeter);



      }
   }