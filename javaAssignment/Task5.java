import java.util.Scanner;
public class Task5{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int addition=0;
	for(int count=0;count<10;count++){
	System.out.print("enter score:");
	int score=input.nextInt();
	if(count%2==0){
	addition+=score;
	}
	}
	System.out.print(addition);
	
	}
}