import java.util.Scanner;
public class Password{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("enter password:");

	String password = input.next();
	int length = password.length();



	if(length>=11){
		System.out.print("invalid password");
	}else{
		System.out.print("valid password"); 
	}


	
	
	} 
}