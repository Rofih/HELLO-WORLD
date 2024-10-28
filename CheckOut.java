import java.util.Scanner;
public class CheckOut{
	public static void main(String[] args){
	getInput();

	}
	public static void getInput(){
		Scanner input = new Scanner(System.in);
		System.out.print("What is customer's name?");
		String customerName = input.nextLine();
		String answer = "";
		while(true){
		System.out.print("What did user buy?");
		String userInput = input.next();
		System.out.print("How many pieces?");
		int pieces = input.nextInt();
		System.out.print("How much per unit?");
		int unitSize = input.nextInt();
		System.out.print("Add more items?");
		String items = input.next();
		if(items == "yes"){
			getCondition();
		}
		else{
			break;
		}
		}

	}
	public static String [] getCondition(){
		Scanner input = new Scanner(System.in);

		String userInput; 
		System.out.print("What did user buy?");
		userInput = input.next();
		System.out.print("How many pieces?");
		String pieces = input.next();
		System.out.print("How much per unit?");
		String unitSize = input.next();
		System.out.print("Add more items?");
		String items = input.next();
		
		String [] array = {userInput,pieces,unitSize,items};
		return array;
	}
}