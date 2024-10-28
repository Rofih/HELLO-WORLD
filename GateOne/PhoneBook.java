import java.util.ArrayList;
import java.util.Scanner;
public class PhoneBook{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		ArrayList<String> contact = new ArrayList<String>();
		while(true){
			System.out.print("pls do you want to create a new contact?,if Yes enter 1,if No enter 0");
			int userInput = input.nextInt();
			if(userInput==1){
				
				contact.add(createContact());	
			}
		}
	}
	public static String createContact(){
		Scanner input = new Scanner(System.in);

		System.out.print("pls enter name:");
		String name = input.nextLine();

		System.out.print("pls enter address:");
		String homeAddress = input.nextLine();

		System.out.print("pls enter number:");
		String number = input.nextLine();

		System.out.print("pls enter email:");
		String email = input.nextLine();

		Journal journal = new Journal(name,homeAddress,number,email);
		

		String message = "well done contact saved";
		return message;
		
	}
}