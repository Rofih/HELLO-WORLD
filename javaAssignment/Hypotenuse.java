public class Hypotenuse{
	
	public static void hypotenuseCalculations(double oppo,double adj){
		double hypo=Math.pow(oppo,2) + Math.pow(adj,2);
		double hypotenuse=Math.sqrt(hypo);
		System.out.printf("%.2f",hypotenuse);
		
	} 
}