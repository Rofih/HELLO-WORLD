import java.util.Scanner;
public class mathApp{
   public static void main(String[] args){
      System.out.print("Kata.isEven(input)");
      System.out.print("");
      System.out.print("");
   }
     public static void list(){
    String menu=\n1.Even or Odd\n2.Prime number\n3.Subtract\n4.Divide\n5.Factor\n6.Square\n7.Palindrome\n8.Factorial\n9.Square;
     System.out.print(menu);

     }

     public static void userInput(){
       Scanner input=new Scanner(System.in);
       int input=input.nextInt();

     }
      
     int list=input.nextInt();

     switch (list)
		case 1:
                     Kata.isEven(input);
                     System.out.print("");
                     list();  
		case 2:
                     Kata.isPrimenumber(input);
                     System.out.print("");
                     list();
  		case 3:
                     Kata.isSubtract(input);
                     System.out.print("");
                     list();
                case 4:
                     Kata.isDivide(input);
                     System.out.print("");
                     list();
                case 5:
                     Kata.palindrome(input);
                     System.out.print("");
                     list();
                case 6:
                     Kata.SquareOf(input);
                     System.out.print("");
                     list();

                case 7:
                      palindrome(input);
                      System.out.print("");
                      list();
                case 8:
                      SquareOf(input);
                      System.out.print("");
                      list();




}