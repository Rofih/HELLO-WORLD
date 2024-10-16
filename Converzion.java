import java.util.Scanner;
public class Converzion{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number to convert mile to kilometer:");
		int number=input.nextInt();
		System.out.print("Enter a number to covert kilometer to mile :");
		int number1=input.nextInt();

		System.out.printf("%.2f\n", mileToKilometer(number1));
		System.out.printf("%.2f",kilometerToMile(number1));

}
	public static double mileToKilometer(double mile){
		double convert=mile/1.60934; 
		return convert;

	}
	public static double kilometerToMile(double kilometer){
		double conversion=kilometer*0.62137;
		return conversion;
	}
}









