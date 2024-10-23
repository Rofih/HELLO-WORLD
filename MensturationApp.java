import java.time.*;
import java.util.Scanner;
public class MensturationApp{
	
	public static void information(){
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the date of your last menstural flow in format(yyyy-mmm-dd) :");
		String flowDate = input.next();
		LocalDate lastFlowDate = LocalDate.parse(flowDate);


		
			System.out.print("Do you know how the duration of your menstral cycle?,if YES enter 1 then if NO enter 0")
			int duration = input.nextInt();
			if(durattion == 1){ 
				System.out.print("How long is your menstral cycle ? ");
				int menstralCycle = input.nextInt();
				if(menstralCycle >35){
					System.out.print("Ma pls your kinda off with what you inputed");
				}
		
		System.out.println("Your next menstral flow is"+ MensturationApp.calculateFlow(lastFlowDate,menstralCycle) );

		System.out.print("Do you want to know your likely ovulation period?,if YES enter 1 then if NO enter 0");
		int answer3 = input.nextInt();
		if(answer3==1){
			System.out.println("Your ovulation is likely on the" + MensturationApp. calculateOvulation(lastFlowDate));
		
		}
		System.out.print("Do you want to know your likely safe periods?,if YES enter 1 then if NO enter 0");
		int answer4 = input.nextInt();
		if(answer4==1){
			System.out.print("Your safe period will likely range from "+MensturationApp. calculateSafeDaysBeginning(lastFlowDate)+"to"+MensturationApp.calculateSafeDaysEnding(lastFlowDate));
		}
		
		
		
		System.out.print("Have you given birth?,if YES enter 1 then if NO enter 0:");
		int answer = input.nextInt();
		if(answer==1){
			System.out.print("Are you a lactating mother?,if YES enter 1 then if NO enter 0");
			int answer2 = input.nextInt();
			
		}
		
		
	}
	public static LocalDate calculateFlow(String thatDate,int cycle){   
		LocalDate date = LocalDate.parse(thatDate);
		LocalDate play = date.plusDays(cycle);
		return play;
		
	}
	public static LocalDate calculateOvulation(String thatDate){
		LocalDate date = LocalDate.parse(thatDate);
		LocalDate play = date.plusDays(14);
		return play;


	}
	public static LocalDate calculateSafeDaysBeginning(String thatDate){
		LocalDate date = LocalDate.parse(thatDate);
		LocalDate play = date.plusDays(5);
		return play;

	}

	public static LocalDate calculateSafeDaysEnding(String thatDate){
		LocalDate date = LocalDate.parse(thatDate);
		LocalDate play = date.plusDays(12);
		return play;

	}
}