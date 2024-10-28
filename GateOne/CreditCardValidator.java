import java.util.Scanner;
public class CreditCardValidator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("enter card details to verify:");
		String cardNumber = input.next();
		for(int count = 0; count < cardNumber.length();count++){
			if(cardNumber.charAt(count) != '0' || cardNumber.charAt(count) != '1' || cardNumber.charAt(count) != '2' || cardNumber.charAt(count) != '3' || cardNumber.charAt(count) != '4' ||   cardNumber.charAt(count) != '5' || cardNumber.charAt(count) != '6' || cardNumber.charAt(count) != '7' || cardNumber.charAt(count) != '8' || cardNumber.charAt(count) != '9'){
			System.out.print("shey that be card number");
				break;
			}
		}
		getOutput(cardNumber);
	}
	public static void getOutput(String cardNumber){
		char [] list = new char [cardNumber.length()];
		for(int counter = 0;counter<cardNumber.length();counter++){
			list[counter] = cardNumber.charAt(counter);
		}
		int [] array = new int [cardNumber.length()];
		

		for(int count = 0;count<list.length;count++){
			array[count] = Integer.parseInt(String.valueOf(list[count]));
		}
 
		System.out.println("Credit card type:" + getCardType(array));
		System.out.println("Credit card number:" + cardNumber);
		System.out.println("Credit card length:" + getCardDigitLength(array));
		System.out.print("Credit card validity status:" + getValidation(array));
	}
	public static String getValidation(int [] array){
		int total = 0;
		int total2 = 0;
		int digit = 0;
		int digit2 = 0;
		int mainTotal = 0;
		for(int count = 0;count<array.length;count+=2){
			if(array[count]<5){
				total+=array[count]*2;
			}
			else{
				digit = (array[count]*2)%10;
				digit2 = (array[count]*2)/10;
				total2 += digit + digit2;
			}
		}
		mainTotal = total + total2;
		if(mainTotal%10==0){
			return "valid";
		}
		else{
			return "invalid";
		}
		
	}
	public static String getCardType(int [] array){
		if(array[0]==4){
			return "Visa Card";
		}
		else if(array[0]==5){
			return "MasterCard";
		}
		else if(array[0]==3 && array[1]==7){
			return "AmericanExpress Card";
		}
		else if(array[0]==6){
			return "Discover Cards";
		}
		else{
			return "invalid input";
		}
	}
	public  static int getCardDigitLength(int [] array){
		int digitLength = 0;
		for(int index = 0;index<array.length;index++){
			
			digitLength++;
		}
		return digitLength;
	}
}