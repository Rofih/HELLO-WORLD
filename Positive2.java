import java.util.Scanner;
public class Positive2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive number:");
		double number = input.nextDouble();
		int count=0;
		int error=0;
		while(count<=error){
			PositiveSquareRoot(number);
		count+=error;	
		}
		
}
	public static double PositiveSquareRoot(double number){
		if(number<0){
				System.out.print("not a positive number");
		}
			
				return Math.sqrt(number);

				
       }

	//public static void Repeat(){
		//System.out.print("Enter a positive number:");
		//double number = input.nextDouble();
		//PositiveSquareRoot(number);



//}


	
}
