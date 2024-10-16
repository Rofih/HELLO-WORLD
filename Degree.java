import java.util.Scanner;
public class Degree{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Celsius degree:");
		float celsius=input.nextFloat();
		float fahrenheit=(9/5)*celsius+32;
		System.out.print(fahrenheit);
	}
}