import java.util.ArrayList;
import java.util.Scanner;
public class BankeBank{
	private double balance;
	private String firstName;
	private String secondName;
	private String password;

	BankeBank(String firstName,String secondName,String password){
		this.firstName = firstName;
		this.secondName = secondName;
		this.password = password;
	}

	public void deposit(double amount){
		if(amount>0){
		balance+=amount;
		}
	}
	public double getBalance(){
		return balance;
	}
	public void withdrawMoney(double amount){
		if(balance>0){
		balance = balance - amount;
		}
	}
	public void transferMoney(double amountToTransfer,Account recipient){
		if(balance>0){
		balance = balance - amountToTransfer;
		recipient.deposit(amountToTransfer);
		}
	}
	public void contactInformation(String information,String information2,String pin){
		firstName = information;
		secondName = information2;
		password = pin;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		ArrayList<String> contact = new ArrayList<String>();
		System.out.println("You are welcome to BankeBank ,the best bank");

		String lst = "pls select your option/n1.Create account./n2.Deposit money./n3.Check balance./n4.Transfer./n5.Change pin./n6.Withdraw money./n7.Close account.";

		
		System.out.print(lst);
		int userInput = input.nextInt();		

		if(userInput==1){
			System.out.print("pls enter first name:");
			String nameI = input.nextLine();
			System.out.print("pls enter second name:");
			String nameII = input.nextLine();
			System.out.print("pls enter password:");
			String pin = input.nextLine();
			BankeBank account = new BankeBank(nameI,nameII,pin);
			contact.add(account);
			System.out.print(lst);
			userInput = input.nextInt();
			if(userInput==4){
				System.out.print("pls enter the account you want to transfer too");
				int depo = input.nextInt();
				System.out.print("pls enter amount you want to transfer:");
				int transferAmount = input.nextInt();
				account.transferMoney(transferAmount,contact(depo));
			
			}
			System.out.print(lst);
			userInput = input.nextInt();
			if(userInput==3){
			System.out.println("Your balance is" + account.getBalance());
			}
			System.out.print(lst);
			userInput = input.nextInt();
			if(userInput==2){
			System.out.print("pls enter amount you want to deposit:");
			int deposit = input.nextInt();
			}
		}
	}
}