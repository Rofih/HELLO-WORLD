public class Swap{
	public static int [] swapper(int [] array){
		for(int count = 1;count<array.length-1;count+=2){
			int temp = array[count];
			array[count] = array[count-1]; 
			array[count-1] = temp;
	
		}
		return array;

	}
}