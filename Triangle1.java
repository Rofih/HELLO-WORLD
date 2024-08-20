import java.util.Scanner;
public class Triangle1
  {
     public static void main(String[] args)
     {
       Scanner input=new Scanner(System.in);
       System.out.print("Enter first side:");
       int value1 = input.nextInt();
       System.out.print("Enter second side:");
       int value2 = input.nextInt();
       System.out.print("Enter third side:");
       int value3 = input.nextInt();
       int semiperimeter = (value1 + value1 + value3)/2;
       System.out.printf("Semiperimeter is %d%n", semiperimeter);
       int point = semiperimeter *(semiperimeter -value1)*(semiperimeter -value2)*(semiperimeter-value3);
       double area = Math.sqrt(point);
       System.out.printf("Area is %d%n", area);



      }
   }