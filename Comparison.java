import java.util.Scanner;
public class Comparison
  {
     public static void main(String[] args)
     {
       Scanner input=new Scanner(System.in);
       System.out.print("Enter first side:");
       int value1 = input.nextInt();
       int value2 = value1 * value1;
       if(value1 > value2)
        {
 
          System.out.printf("%d > %d%n",value1,value2);
         }
       if(value1 != value2)
        {
 
          System.out.printf("%d != %d%n",value1,value2);
         }
 
      }
   }