public class MaxAndMinArray{
	public static void main(String[] args){
		sumArrayToGetMinAndMax();
	}
	public static void sumArrayToGetMinAndMax(){
		int [] array={5,10,2,1,7};
		int add=0;
		int plus=0;
		
		for(int count=0;count<array.length;count++){
			add+=array[count];
		}
		int [] play=new int [array.length];
		for(int counter=0;counter<array.length;counter++){
			
			play[counter] = add-array[counter];
		}
		int max=play[0];
		int mini=play[0];
		for(int counted=0;counted<array.length;counted++){
			
			if(max<play[counted]){
				max=play[counted];
			}
			
			if(play[counted]<mini){
				mini=play[counted];
			}
		}
		int [] miniandmax=new int [2];
		miniandmax[0]=mini;
		miniandmax[1]=max;
		//for(int toy=0;toy<2;toy++){
			//System.out.print(miniandmax[toy]+" ");
		//}
		int valuemini=0;
		int valuemax=0;
		for(int list=0;list<array.length;list++){
			if((play[list]=add-array[list])==mini){
				valuemini=array[list];
			}
			if((play[list]=add-array[list])==max){
				valuemax=array[list];
			}
		}
		int [] displays=new int [2];
		displays[0]=valuemini;
		displays[1]=valuemax;
		for(int loop=0;loop<2;loop++){
			System.out.print(displays[loop]+" ");
		}	
	}
}