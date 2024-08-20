import java.util.Scanner;
public class Compare1
  {
     public static void main(String[] args)
     {
       Scanner input=new Scanner(System.in);
       System.out.print("Enter first side:");
       int value1 = input.nextInt();
       System.out.print("Enter second side:");
       int value2 = input.nextInt();
       if (value1 == value2)
         {
          System.out.printf("%d == %d%n",value1,value2);
         }
       if (value1 != value2)
         {
          System.out.printf("%d != %d%n",value1,value2);
         }
       if (value1 < value2)
         {
          System.out.printf("%d < %d%n",value1,value2);
         }
       if (value1 > value2)
         {
          System.out.printf("%d > %d%n",value1,value2);
         }
       if (value1 <= value2)
         {
          System.out.printf("%d <= %d%n",value1,value2);
         }
       if (value1 == value2)
         {
          System.out.printf("%d >= %d%n",value1,value2);
         }
      }
    }