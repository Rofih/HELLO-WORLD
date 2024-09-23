import java.util.Scanner;
import java.util.Random;
public class CrapsGame{
	public static void gameModification(){
		int bankBalance=1000;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a wager:");
		int wager=input.nextInt();
		if(wager>=bankBalance){
			System.out.println("okay");
			int newBankBalance=wager+bankBalance;
			System.out.println("Enter the word start to begin the game");
			String button=input.next();
			if(button=="start"){
			Random rand=new Random();
			int number=rand.nextInt(2);
 			int number2=rand.nextInt(2);

			if(number==number2){
				System.out.print("Congratulations!!");
			}
			if(number!=number2){
				System.out.print("Sorry.You lost");
				int fail=2000-newBankBalance;
			}
			}

			if(newBankBalance==0){
				System.out.print("Sorry.You busted");
			}


			if(newBankBalance<bankBalance&&newBankBalance>0){
				System.out.print("Oh,you're going for broke,huh?");
			}
			else{
				System.out.print("You're up big");
			}
		}
		else{
			System.out.print("invalid amount");
		}
	}
}