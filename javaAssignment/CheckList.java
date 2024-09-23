import java.util.Scanner;
public class CheckList{
	public static void main(){
		listChecker();
	}
	public static void listChecker(){
		System.out.print("enter number to be checked:");
		int value=input.nextInt();
		System.out.print("enter list to be checked:");
		

		int [] numbers=new int [];
		for(int count=0;count<numbers.length;count++){
			if(numbers[count]==value){
				System.out.print("it is in the list");
			}
			else{
				System.out.print("it is not in the list");
			}
			
		}
	}
}