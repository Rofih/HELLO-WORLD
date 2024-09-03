import java.util.Scanner;
public class Tax{
	public static void main(String[] args){
           Scanner input=new Scanner(System.in);
           
           System.out.print("Enter your earnings:");
           float value = input.nextFloat();

          if(value<=30000){
              double tax=0.15*value;
              System.out.print(tax);

          }
           if(value>30000){
              double tax=0.2*value;
              System.out.print(tax);

          }




	}
}