import java.util.Random;
import java.util.Scanner;
public class  Permutation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int [] array = new int [4];
		for(int toy = 0;toy<array.length;toy++){
		System.out.print("enter an integer:");
			array[toy]=input.nextInt();	
		}
		possibleOutComes(array);
	}
	public static void possibleOutComes(int [] numbers){
		Random rand = new Random();
		int [] list = new int [numbers.length];
		int value = 0;
		for(int index = 0;index<numbers.length;index++){
			value = rand.nextInt(numbers.length);
			list[index] =  numbers[value];
		}
		for(int play = 0;play<list.length;play++){
			System.out.print(list[play]);
		}
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   