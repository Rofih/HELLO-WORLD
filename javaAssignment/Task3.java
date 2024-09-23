import java.util.Scanner;
public class Task3{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int addition=0;
	for(int count=0;count<10;count++){
	System.out.print("enter score:");
	int score=input.nextInt();
	addition+=score;
	}
	int div=addition/10;
	System.out.printf("this is the average %d",div);
	System.out.printf("\nthis is the sum %d",addition);
	
	}
}