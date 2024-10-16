import java.util.Scanner;
public class Play{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter the amount of scores to be inputed:");
		int inputedScores=input.nextInt();
		int [] score=new int [inputedScores];
		int largest=0;
		int lowest=0;
		int plus=0;
		int add=0;
		for(int count=0;count<inputedScores;count++){
			System.out.print("enter scores:");
			score[count]=input.nextInt();
			plus+=1;
		}
		for(int counter=0;counter<inputedScores;counter++){
		System.out.print(score[counter]);
		add+=score[counter];
		}
		for(int counted=0;counted<inputedScores;counted++){
			largest=score[0];
			if(largest<score[counted]){
				largest=score[counted];
			}
			lowest=score[0];
			if(score[counted]<lowest){
				lowest=score[counted];
				
			}
		}
		System.out.printf("\nthis is the largest %d",largest);
		System.out.printf("\nthis is the lowest %d",lowest);
		int div=add/plus;
		System.out.printf("\nthis is the average %d",div);

	}
}