 import java.util.Scanner;
public class Volume1
  {
     public static void main(String[] args)
     {
       Scanner input=new Scanner(System.in);
       System.out.print("Enter first integer:");
       int value1 = input.nextInt();
       
       double root = Math.sqrt(3);
       double area = root / 4 * ( value1 * value1);
       System.out.printf("Area is %d%n", area);
       double volume =area * value1 ;
       System.out.printf("Volume is %d%n", volume);
      }
   } 