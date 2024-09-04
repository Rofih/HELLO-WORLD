import java.util.Scanner;
public class Encryption{
	public static void main(String[] args){
           Scanner input=new Scanner(System.in);
           System.out.print("Enter the number :");
           int value = input.nextInt();

           int value1=value/1000;
           int value2=(value/100)%10;
           int value3=(value/10)%10;
           int value4=value%10;

           System.out.print("%d%d%d%d",value1,value2,value3,value4);







	}
}