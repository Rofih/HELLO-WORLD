import java.util.Scanner;
public class Hypotenuse2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a side:");
		double oppo=input.nextInt();
		System.out.print("Enter the other side:");
		double adj=input.nextInt();
		Hypotenuse.hypotenuseCalculations(oppo,adj);
	}

}