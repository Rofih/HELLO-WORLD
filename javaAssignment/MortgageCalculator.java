import java.util.Scanner;
public class Mortgage{

   private final byte monthInYears = 12;	
   private final byte percentageRate = 100;

   public static void main(String[] args){

      Scanner input = new Scanner(System.in);	

      System.out.print("Enter principal amount: ");
      double PrincipalAmount = input.nextDouble();

      System.out.print("Enter the annual intrest rate: ");
      double annualInterestRate = input.nextDouble();

      System.out.print("Enter the duration in years: ");
      int durationInYears = input.nextInt();
      
     	

      double calculatedRate = annualInterestRate/100;
      int numberOfMonths = durationInYears*12;


      double mortgagePayment = PrincipalAmount * (( Math.pow(calculatedRate * (1 + calculatedRate),numberOfMonths)))/((Math.pow((1 + calculatedRate),numberOfMonths)-1));



      
      System.out.printf("Your monthly payment is "+ "$"+ mortgagePayment);

    }

}