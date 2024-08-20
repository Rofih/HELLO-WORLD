import java.util.Scanner;
public class Calculation2 
  {
     public static void main(String[] args)
     {
       Scanner input=new Scanner(System.in);
       System.out.print("Enter radius:");
       int value1 = input.nextInt();     
       double pi =3.14159;
       double perimeter = 2 * value1 * pi ;
       System.out.printf("perimeter is %d%n", perimeter);
       double area = value1 * value1* pi;
       System.out.printf("Area is %d%n", area);



      }
   }
   