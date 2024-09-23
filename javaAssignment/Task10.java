import java.util.Scanner;
public class Task10{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int addition=0;
	int counter=0;
	for(int count=0;count<10;count++){
	System.out.print("enter score:");
	int score=input.nextInt();
	if(score>0&&score<100){
	addition+=score;
	counter+=1;
	}
	}
	int div=addition/counter;
	System.out.print(div);
	
	}
}