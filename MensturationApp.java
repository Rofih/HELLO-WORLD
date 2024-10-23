import java.time.*;
import java.util.Scanner;
public class MensturationApp{
	
	public static void information(){
		
		Scanner input = new Scanner(System.in);
		try {

		System.out.print("Welcome to MenstralApp,Do you want to learn more about menstral cycle?,if YES enter 1 then if NO enter 0");
		int info = input.nextInt();
		if(info==1){
		 menstralInformation();
		}
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
		}catch(Exception e){
			System.out.print("Invalid input: "+ e.getMessage);
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
	public static void menstralInformation(){
		String info = '''
		Menstruation is a natural biological process in females, part of the reproductive cycle. Here's an overview:

		Phases of Menstruation:

		1. Menstruation (Days 1-5): Uterine lining sheds, resulting in bleeding.
		2. Follicular Phase (Days 6-14): Hormones stimulate follicle growth, preparing for ovulation.
		3. Ovulation (Day 14): Release of an egg from the ovary.
		4. Luteal Phase (Days 15-28): Hormones prepare the uterus for potential pregnancy.

		Menstrual Cycle Length:

		- Average: 28 days
		- Normal range: 21-35 days
		- Irregular cycles: Variations in length or frequency
	
		Menstrual Symptoms:

		- Cramping (dysmenorrhea)
		- Bloating
		- Mood swings
		- Fatigue
		- Breast tenderness

		Menstrual Products:

		- Sanitary pads
		- Tampons
		- Menstrual cups
		- Period panties

		Menstrual Health:

		- Hygiene: Change products regularly
		- Nutrition: Balanced diet, iron-rich foods
		- Exercise: Regular physical activity
		- Mental well-being: Stress management, self-care

		Common Menstrual Disorders:

		- Amenorrhea (absent periods)
		- Dysmenorrhea (painful periods)
		- Endometriosis
		'''';
		System.out.print(info);

	}
}