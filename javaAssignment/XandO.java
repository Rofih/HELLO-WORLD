public class  XandO{
	public static void main(String[] args){
		char [][] patterns=new char [3][3];
		patterns[0][0]='x';
		patterns[0][1]='o';
		patterns[0][2]='x';

		patterns[1][0]='x';
		patterns[1][1]='o';
		patterns[1][2]='x';

		patterns[2][0]='x';
		patterns[2][1]='o';
		patterns[2][2]='x';

		for(int count=0;count<3;count++){
			System.out.print(patterns[0][count]+" ");
			
			System.out.print(patterns[1][count]+" ");
			
			System.out.print(patterns[2][count]+"   \n");
			
		}


	}
}