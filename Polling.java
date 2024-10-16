import java.util.Scanner;
public class Polling{
	public static void main(String[] args){
		rating();
	}
	public static void rating(){
		Scanner input = new Scanner(System.in);
		String [] issues = {"corruption","arm banditry","poor education system","housing and infrastructure","poor maintennance of roads"};
		int [] ratings = new int [issues.length];
		int [][] display = new int [issues.length][10];
		int one = 0; int sum = 0;
		int two = 0; int sum2 = 0;
		int three = 0; int sum3 = 0;
		int four = 0; int sum4 = 0;
		int five = 0; int sum5 = 0;
		int six = 0; int sum6 = 0;
		int seven = 0; int sum7 = 0;
		int eight = 0; int sum8 = 0;
		int nine = 0; int sum9 = 0;
		int ten = 0; int sum10 = 0;
		for(int index = 0; index<issues.length;index++){
			System.out.println("Based on"+" "+ issues[index]+" "+ "please rate on a scale from 1 to 10");
			ratings[index] = input.nextInt();
			if(ratings[index]==1){
				one+=1;
				sum+=ratings[index];
			}
			if(ratings[index]==2){
				two+=1;
				sum2+=ratings[index];
			}
			if(ratings[index]==3){
				three+=1;
				sum3+=ratings[index];
			}
			if(ratings[index]==4){
				four+=1;
				sum4+=ratings[index];
			}
			if(ratings[index]==5){
				five+=1;
				sum5+=ratings[index];
			}

			if(ratings[index]==6){
				six+=1;
				sum6+=ratings[index];
			}
			if(ratings[index]==7){
				seven+=1;
				sum7+=ratings[index];
			}
			if(ratings[index]==8){
				eight+=1;
				sum8+=ratings[index];
			}
			if(ratings[index]==9){
				nine+=1;
				sum9+=ratings[index];
			}
			if(ratings[index]==10){
				ten+=1;
				sum10+=ratings[index];
			}




		}
		int [] newRating = {one,two,three,four,five,six,seven,eight,nine,ten};

		for(int counter = 0;counter<5;counter++){
			//for(int counted = 0;counted<newRating.length;counted++){
				System.out.println(issues[counter]+"                 "+ratings[counter]+"\n");
			//}
		}
		
	} 
}