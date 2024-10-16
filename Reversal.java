import java.util.Scanner;
public class Reversal{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number:");
		int rofih=input.nextInt();
		reverse(rofih);
}

	public static void reverse(int number){
		int value1=number%10;
                int value2=number/10;
                int value3=value2%10;
                int value4=value2/10;
		int value5=value4%10;
		int value6=value4/10;

                
		System.out.printf("%d%d%d%d",value1,value3,value5,value6);
}
}