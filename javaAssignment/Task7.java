import java.util.Scanner;
public class Task7{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int counter=0;
	int addition=0;
	for(int count=0;count<10;count++){
	System.out.print("enter score:");
	int score=input.nextInt();
	if(score%2==0){
	addition+=score;
	counter+=1;
	}
	}
	int div=addition/counter;
	System.out.printf("this is the average %d",div);
	System.out.printf("this is the sum %d",addition);
	
	}
} 