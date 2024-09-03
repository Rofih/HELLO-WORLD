import java.util.Scanner;
public class Cryptography{
	public static void main(String[] args){
           Scanner input=new Scanner(System.in);
           System.out.print("Enter the number :");
           int value = input.nextInt();

           int value1=value%10;
           int value2=value1%10;
           int value3=value2%10;
           int value4=value2/10;
           int encryption=(value3*1000);
           int encryption1=(value4*100);
           int encryption2=(value1*10);

           System.out.print(encryption+encryption1+encryption2+value1);

}
}
