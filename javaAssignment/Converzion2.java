import java.util.Scanner;
public class Converzion2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter milliseconds:");
		long millisec =input.nextLong();
		System.out.print(ConvertMillis(millisec));
}
	public static String ConvertMillis(long millis){
		long secs=millis/1000;
		long minutes=(secs%3600)/60;
		long hours=millis/3600;
		long seconds=secs % 60;

		return hours+":"+ minutes +":"+ seconds;
		
		//return String.format("%.2d:%.2d:%.2d", hours,minutes,seconds);

	}
}