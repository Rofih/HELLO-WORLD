import java.util.Scanner; 
public class Leap2{
	public static void main(String[] args){
		Scanner input=new Scanner;
		System.out.print("Enter a year to check if it is a leap year:");
		int year=input.next();
		Leap.testForLeapYear(year);
}
	