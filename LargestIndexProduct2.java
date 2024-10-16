import java.util.Arrays;
public class LargestIndexProduct2{
	public static void main(String[] args){
		int [] list = {1,2,3,4};
		System.out.print(LargestIndex(list));
	}

	public static String LargestIndex(int[] list){
		int [] index =new int [2];
		int value = list.length*list.length;
		int [] array = new int [value];
		int add = 0;
		int number = 0;
		int play = 0;
		for(int count = 0;count<list.length;count++){
			number=list[count];
			for(int counter = 1;counter<array.length;counter++){
				array[counter]=number*list[play++];
			}
				
		}
		return Arrays.toString(array);
		
		
	}
}