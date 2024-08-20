 
import java.util.Scanner;
public class Conversion1
  {
     public static void main(String[] args)
     {
       Scanner input=new Scanner(System.in);
       System.out.print("Enter first integer:");
       int value1 = input.nextInt();
       float pi=3.14159; 
       int perimeter = 2 * value1 *pi;
       System.out.printf("Perimeter is %d%n", perimeter);
      int area = value1 * value1 *pi;
       System.out.printf("Area is %d%n", area);



      }
   }