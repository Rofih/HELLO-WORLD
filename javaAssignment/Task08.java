import java.util.Scanner;
public class Task08{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int addition=0;
	while(addition!=-1){
	System.out.print("enter score:");
	int score=input.nextInt();
	if(score>0&&score<100)
	
	addition+=score;
	
	}
	System.out.print(addition);
	
	}
}