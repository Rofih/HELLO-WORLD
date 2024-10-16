import java.util.Arrays;
public class LargestIndexProduct{
	public static void main(String[] args){
		int [] list = {3,6,4,9};
		System.out.print(largestProduct(list));
	}
	public static String largestProduct(int [] array){
		int largest = array[0];
		int secondLargest = array[0];
		int [] list = new int [2];
		for(int count = 0;count<array.length;count++){
			if(largest<array[count]){
				largest = array[count];
				list[0] = count;
				array[count] = 0;
			}
		}

		
		for(int counter = 0;counter<array.length;counter++){
			if(secondLargest<array[counter]){
				list[1] = counter;
			}
		}
		return Arrays.toString(list);
	}
}