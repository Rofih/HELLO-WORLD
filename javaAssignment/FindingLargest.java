import java.util.Scanner;
public class FindingLargest{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter list of numbers:");
		int [] list = new int [2];
		for(int counter=0;counter<list.length;counter++){
		list [counter] =input.nextInt();
		}
		largestElement(list);	
	}
	public static int largestElement(int [] number){
		int Large=number [0];
		for(int count=0;count<number.length;count++){
			if(Large<number[count]){
				Large=number[count];
			}
		}
		return Large;
	}
}