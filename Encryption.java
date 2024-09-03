import java.util.Scanner;
public class Encryption{
	public static void main(String[] args){
           Scanner input=new Scanner(System.in);
           System.out.print("Enter the number :");
           int value = input.nextInt();

           int value1=value%10;
           int value2=value1%10;
           int value3=value2%10;
           int value4=value2/10;
           int encryption=(value1+7)%10;
           int encryption1=(value2+7)%10;
           int encryption2=(value3+7)%10;
           int encryption3=(value4+7)%10;
           int encrypted=(encryption2*1000)+(encryption3*100)+(encryption*10)+encryption1;
           System.out.print(encrypted);

}
}
