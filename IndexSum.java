import java.util.Arrays;
public class IndexSum{
	public static void sumIndex(int[] list,int indexSum){
		int [] index =new int [2];
		int add = 0;
		for(int count = 0;count<list.length;count++){
			add=list[count];
			for(int counter = 1;counter<list.length;counter++){
				if(indexSum == (add + list[counter])){
					index[0]=count;
					index[1]=counter;
					System.out.print(Arrays.toString(index));
				}
			}
				
		}
		
		
		
	}
}