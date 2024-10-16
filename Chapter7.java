import java.util.Scanner;
public class Chapter7{
	public static void main(String[] args){

	}
	public static void displayTenthElement(int [] array){
		Scanner input=new Scanner(System.in);
		for(int count=0;count<array.length;count++){
			System.out.print("enter digit:");
			array[count]=input.nextInt();
			
		}
		System.out.print(array[9]);
	}
	public static void sixthelement(int [] array){
		Scanner input=new Scanner(System.in);
		for(int count=0;count<array.length;count++){
			System.out.print("enter digit:");
			array[count]=input.nextInt();
			
		}
		array[5]=-1;
		for(int counter=0;counter<array.length;counter++){
			System.out.print(array[counter]);
		}
	}
	public static void  maximumFloat(float [] array){
		Scanner input=new Scanner(System.in);
		for(int count=0;count<array.length;count++){
			System.out.print("enter digit:");
			array[count]=input.nextFloat();
			
		}
		float largest=0;
		array[0]=largest;
		for(int counter=0;counter<array.length;counter++){
			if(largest<array[counter]){
			 	largest=array[counter];
			
			}
		}
		System.out.print(largest);
		
	}
	public static void copyList(int [] array){
		Scanner input=new Scanner(System.in);
		for(int count=0;count<array.length;count++){
			System.out.print("enter digit:");
			array[count]=input.nextInt();
			
		}
		int [] value=int [];
		for(int counter=0;counter<array.length;counter++){
			value[counter]=array[array.length-counter]
			System.out.print(value[counter]);
		}
	}
}