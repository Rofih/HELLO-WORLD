import java.util.Scanner;
public class AlmightyFormula{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter b:");
		int bee=input.nextInt();
		System.out.print("Enter a:");
		int ayy=input.nextInt();
		System.out.print("Enter c:");
		int cee=input.nextInt();
		int negbee=-1*bee;
		double squarebee=Math.pow(bee,2);
		int fourac=4*ayy*cee;
		int twoa=2*ayy;
		double minus=squarebee-fourac;
		double sqroot=Math.sqrt(minus);
		double add=negbee+sqroot;
		double root=add/twoa;
		System.out.print(root);
		
	}
	
}