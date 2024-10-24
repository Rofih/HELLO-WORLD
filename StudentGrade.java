import java.util.Arrays;
import java.util.Scanner;
public class StudentGrade{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("pls enter number of students");
		int numberOfStudents = input.nextInt();
		System.out.print("pls enter number of subjects");
		int numberOfSubjects = input.nextInt();
		
		int [][] scores = new int [numberOfStudents][numberOfSubjects];
		for(int student = 0;student<numberOfStudents;student++){
			for(int index = 0;index<numberOfSubjects;index++){
				System.out.println("pls enter score"+" "+ (index+1)+" "+"of student" + (student+1));
				scores[student][index] = input.nextInt();
				if(scores[student][index]>100 || scores[student][index]<0){
					break;
				}
			}
		}
		firstDisplay(scores,numberOfSubjects);
	}
	public static void firstDisplay(int [][] array,int numberOfSubjects){
		int total = 0;
		int [] totals = new int [array.length];
		for(int student = 0;student<array.length;student++){
			for(int index = 0;index<numberOfSubjects;index++){
				totals[student] += array[student][index]; 
			}
		}
		double [] averages = new double [array.length];
		for(int student = 0;student<array.length;student++){
			averages[student] = (totals[student]/array.length);
		}
		for(int student = 0;student<array.length;student++){
			for(int index = 0;index<numberOfSubjects;index++){
				System.out.println( "Student" + (student+1)+" "+array[student][index]+ " "+totals[student]+" "+averages[student]+" ");
			}
		System.out.println();
		}
	}
	

}