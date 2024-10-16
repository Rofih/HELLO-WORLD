public class Multiplication{
	public static void main(String[] args){
		System.out.print(toMultiply(-2,-2));
	}
	public static float toMultiply(double number,double value){
		float add = 0;
		if(number<0 && value<0){
			for(double counted = number;counted<0;counted++){
				add-=value;
			}
			return add;
		}
		if(number<0){
			for(double counter = 0;counter<value;counter++){
				add+=number;
			}
			return add;

		}
		for(double count = 0;count<number;count++){
			add+=value;
		}
		return add;
	}
}