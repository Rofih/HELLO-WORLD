import java.util.Arrays;
public class OutputMinMax{
	public static void main(String[] args){
		System.out.print(Arrays.toString(miniMax()));
}
	public static int [] miniMax(){
		int [] array={2,3,5,6,7};
		int max=array[0];
		int mini=array[0];
		int [] list=new int [2];
		for(int count=0;count<array.length;count++){
			if(max<array[count]){
				max=array[count];
			}
			if(array[count]<mini){
				mini=array[count];
			}
		}
		list[0]=max;
		list[1]=mini;
		
		return list;
	}
}