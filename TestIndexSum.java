import java.util.Scanner;
public class TestIndexSum{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("enter amount of numbers to be enterd:");
		int number = input.nextInt();
		int [] list = new int [number];
		for(int count = 0;count<list.length;count++){
			System.out.print("enter numbers:");
			list[count] = input.nextInt();
		}
		System.out.print("enter sum:");
		int addIndex = input.nextInt();
		IndexSum indexSum = new IndexSum();
		indexSum.sumIndex(list,addIndex);
			
	}
}