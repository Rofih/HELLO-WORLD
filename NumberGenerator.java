import java.util.Scanner;
public class NumberGenerator
  {
     public static void main(String[] args)
     {
       Scanner input=new Scanner(System.in);
       System.out.print("I am thinking of a number from 1-20");
       
       System.out.println("Enter a number:");
       int value1 = input.nextInt();
             //int value2 = 17;
        
       for(int value2 = 17;int value2 < 17 )
           if (value1 >value2)
         {
          System.out.printf("Too high,try again");
         }
         while (value1 <value2)
         {
          System.out.printf("Too low,try again");
         }
         
         
       }
  }