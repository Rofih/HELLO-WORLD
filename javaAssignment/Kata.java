import java.util.Scanner;  

public class Kata1{
   public static void main(int value){
    Scanner input=new Scanner(System.in);
    int value=input.nextInt();
       isEven(value);
       isPrimenumber(value)
       Subtract(value);
       divide(value);
       palindrome(value);
       calculatingSquare(value);
    }
}


   public static int isEven(int number){
     Scanner input=new Scanner(System.in);
     System.out.print("Enter a number:");
     int number=input.nextInt();
     
     if(number % 2==0)
       {System.out.print("True");}
     if(number % 2!=0)
        {System.out.print("False");}
         return number;
               }
     
     public static  isPrimenumber(int number){
		int factors = 0; 
		for(int count = 1;count <= number; count++){
			if(number%count==0) 
				factors++;
		}
		if(factors==2){
			return true;
		}else {
			return false;
		}
	           return factors;
         }


    public static void subtract(int number){
      System.out.print("Enter a number:");
      int number1=input.nextInt();

      System.out.print("Enter a number:");
      int number2=input.nextInt();
      
      answer=number1-number2;
      System.out.print("the difference is:%d",answer);

      return answer;
                               }



    public static int divide(int number){
      System.out.print("Enter a number:");
      int number1=input.nextInt();

      System.out.print("Enter a number:");
      int number2=input.nextInt();

      answer=number1/number2;
      System.out.print(answer);


      return answer;
        }





   public static int palindrome(int value){
         Scanner input=new Scanner(System.in);
         System.out.print("Enter a number:");
         int value=input.nextInt();
         int number=value;
         int value1=number%10;
         int value2=number%100;
         int value3=number/10;
         int value4=value3%100;
         int value5=value3/100;
      if(value1==value5)
        {System.out.print("it is a palindrome ");        }
      if(value1!=value5)
        {System.out.print("it is not a palindrome ");        }
            return number;
              }


 public int calculatingSquare(int value){
      System.out.print("Enter a number: ");
      int value=input.nextInt();
      answer=value*value;
      System.out.print(answer);

      return answer;


      }

