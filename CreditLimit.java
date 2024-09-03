import java.util.Scanner;
public class CreditLimit{
	public static void main(String[] args){
           Scanner input=new Scanner(System.in);
           System.out.print("Enter your account number:");
           int account=input.nextInt();
           
           
           System.out.println("Enter balance at the beginning of the month:");
           float balance=input.nextFloat();
           System.out.println("Enter the total charges of items thos:");
           float charge=input.nextFloat();
           System.out.println("Enter credit:");
           float credit=input.nextFloat();
          
           float newBalance=balance+charge-credit;
           if(newBalance>credit){
           System.out.println(newBalance);
           System.out.println("your credit limit has been exceeded");
           }
           else
           System.out.println(newBalance);










        
	}
}