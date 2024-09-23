import java.util.Scanner;
public class TotalList{
	public static void main(){
		Scanner input=new Scanner();
		System.out.print("Enter list");
		int inputedList=input.nextInt();
		int[] list={1, 2, 3, 4};
		SumTotal(list)

	}
	public static void SumTotal(int[] array){
		int add=0;
		for(int counter=0;counter<array.length; counter++){
			add+=list[counter];
		}
		System.out.print(add);
	}
}