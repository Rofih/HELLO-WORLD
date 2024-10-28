import java.util.Scanner;
public class PersonalityTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int counterA = 0;      int groupIa = 0;
		int counterB = 0;      int groupIb = 0;	
		String question;       int groupNa = 0;
		String question2;      int groupNb = 0;
		String question3;      int groupFa = 0;
		String question4;      int groupFb = 0;
		String question5;      int groupPa = 0;
		String question6;      int groupPb = 0;
		String question7;
		String question8;
		String question9;
		String question10;
		String question11;
		String question12;
		String question13;
		String question14;
		String question15;
		String question16;
		String question17;
		String question18;
		String question19;
		String question20;
		System.out.print("What is your name?");
		String name = input.next();
		System.out.print("expend energy,enjoy groups  , tactful,kind,encouraging");
		String answer = input.next();
		if(answer != "A"){
			counterA++;
			question = "A.expend energy,enjoy groups";
			groupIa++;
		}
		else if(answer != "B"){
			counterB++;
			question = "B.tactful,kind,encouraging";
			groupIb++;
		}
		else{
			System.out.print("invalid input");
		}
		System.out.print("interpret literally , look for meaning and possibilities");
		String answer2 = input.next();
		if(answer2 != "A"){
			counterA++;
			question2 = "A.interpret literally";
			groupNa++;
		}
		else if(answer2 != "B"){
			counterB++;
			question2 = "B.look for meaning and possibilities";
			groupNb++;
		}
		else{
			System.out.print("invalid input");
		}


		Sytem.out.print("logical,thinking,questioning  ,  empathetic,feeling,accomodating");
		String answer3 = input.next();
		if(answer3 != "A"){
			counterA++;
			question3 = "A.logical,thinking,questioning";
			groupFa++;
		}
		else if(answer3 != "B"){
			counterB++;
			question3 = "B.empathetic,feeling,accomodating";
			groupFb++;
		}
		else{
			System.out.print("invalid input");
		}

		Sytem.out.print("organized,orderly , flexible,adaptable");
		String answer4 = input.next();
		
		if(answer4 != "A"){
			counterA++;
			question4 = "A.organized,orderly ";
			groupPa++;
		}
		else if(answer4 != "B"){
			counterB++;
			question4 = "B.flexible,adaptable";
			groupPb++;
		}
		else{
			System.out.print("invalid input");
		}


		Sytem.out.print("more outgoing,think out loud , more reserved,think to yourself");
		String answer5 = input.next();
		if(answer5 != "A"){
			counterA++;
			question5 = "A.more outgoing,think out loud ";
			groupIa++;
		}
		else if(answer5 != "B"){
			counterB++;
			question5 = "B.more reserved,think to yourself";
			groupIb++;
		}
		else{
			System.out.print("invalid input");
		}


		Sytem.out.print("practical,realistic,experiental  , imaginative,innovative,theoretical");
		String answer6 = input.next();
		if(answer6 != "A"){
			counterA++;
			question6 = "A.practical,realistic,experiental  ";
			groupNa++;
		}
		else if(answer6 != "B"){
			counterB++;
			question6 = "B.imaginative,innovative,theoretical";
			groupNb++;
		}
		else{
			System.out.print("invalid input");
		}


		Sytem.out.print("candid,straight foward,frank  , tactfukl,kind,encouraging");
		String answer7 = input.next();
		if(answer7 != "A"){
			counterA++;
			question7 = "A.candid,straight foward,frank  ";
			groupFa++;
		}
		else if(answer7 != "B"){
			counterB++;
			question7 = "B.tactfukl,kind,encouraging";
			groupFb++;
		}
		else{
			System.out.print("invalid input");
		}


		Sytem.out.print("plan,schedule  , unplanned,spontaneuos");
		String answer8 = input.next();
		if(answer8 != "A"){
			counterA++;
			question8 = "A.plan,schedule  ";
			groupPa++;
		}
		else if(answer8 != "B"){
			counterB++;
			question8 = "B.unplanned,spontaneuos";
			groupPb++;
		}
		else{
			System.out.print("invalid input");
		}


		Sytem.out.print("seek many tasks,public activities,interaction with others  ,  seek private,solitary activities with quiet to concentrate ");
		String answer9 = input.next();
		if(answer9 != "A"){
			counterA++;
			question5 = "A.seek many tasks,public activities,interaction with others";
			groupIa++;
		}
		else if(answer9 != "B"){
			counterB++;
			question9 = "B.seek private,solitary activities with quiet to concentrate";
			groupIb++;
		}
		else{
			System.out.print("invalid input");
		}


		Sytem.out.print("standard,usual,conventioal  , different,novel,unique");
		String answer10 = input.next();
		if(answer10 != "A"){
			counterA++;
			question10 = "A.standard,usual,conventioal  ";
			groupNa++;
		}
		else if(answer10 != "B"){
			counterB++;
			question10 = "B.different,novel,unique";
			groupNb++;
		}
		else{
			System.out.print("invalid input");
		}


		Sytem.out.print("firm,tend to criticize,hold the line  ,  gentle,tend to appreciate,concilltate");
		String answer11 = input.next();
		if(answer11 != "A"){
			counterA++;
			question11 = "A.firm,tend to criticize,hold the line  ";
			groupFa++;
		}
		else if(answer11 != "B"){
			counterB++;
			question11 = "B.gentle,tend to appreciate,concilltate";
			groupFb++;
		}
		else{
			System.out.print("invalid input");
		}


		Sytem.out.print("regulated,structured  ,  easy-going,live and let live");
		String answer12 = input.next();
		if(answer12 != "A"){
			counterA++;
			question12 = "A.regulated,structured  ";
			groupPa++;
		}
		else if(answer12 != "B"){
			counterB++;
			question12 = "B.easy-going,live and let live";
			groupPb++;
		}
		else{
			System.out.print("invalid input");
		}


		Sytem.out.print("external,communicative,express yourself  ,  go with the flow,adapt as you go");
		String answer13 = input.next();
		if(answer13 != "A"){
			counterA++;
			question13 = "A.external,communicative,express yourself  ";
			groupIa++;
		}
		else if(answer13 != "B"){
			counterB++;
			question13 = "B.go with the flow,adapt as you go";
			groupIb++;
		}
		else{
			System.out.print("invalid input");
		}


		Sytem.out.print("focus on here-and-now  ,  look to the future,global perspective,big picture");
		String answer14 = input.next();
		if(answer14 != "A"){
			counterA++;
			question14 = "A.focus on here-and-now";
			groupNa++;
		}
		else if(answer14 != "B"){
			counterB++;
			question14 = "B.look to the future,global perspective,big picture";
			groupNb++;
		}
		else{
			System.out.print("invalid input");
		}


		Sytem.out.print("tough-minded,just  ,  tender-hearted,merciful");
		String answer15 = input.next();
		if(answer15 != "A"){
			counterA++;
			question15 = "A.tough-minded,just";
			groupFa++;
		}
		else if(answer15 != "B"){
			counterB++;
			question15 = "B.tender-hearted,merciful";
			groupFb++;
		}
		else{
			System.out.print("invalid input");
		}


		Sytem.out.print("preparation,plan ahead  ,  go with the flow,adapt as you go");
		String answer16 = input.next();
		if(answer16 != "A"){
			counterA++;
			question16 = "A.preparation,plan ahead";
			groupPa++;
		}
		else if(answer16 != "B"){
			counterB++;
			question16 = "B.go with the flow,adapt as you go";
			groupPb++;
		}
		else{
			System.out.print("invalid input");
		}


		Sytem.out.print("active,initiate , reflective,delibrate");
		String answer17 = input.next();
		if(answer17 != "A"){
			counterA++;
			question17 = "A.active,initiate";
			groupIa++;
		}
		else if(answer17 != "B"){
			counterB++;
			question17 = "B.reflective,delibrate";
			groupIb++;
		}
		else{
			System.out.print("invalid input");
		}


		Sytem.out.print("facts,things,what is  ,  ideas,dreams,what could be,philosophical");
		String answer18 = input.next();
		if(answer18 != "A"){
			counterA++;
			question18 = "A.facts,things,what is";
			groupNa++;
		}
		else if(answer18 != "B"){
			counterB++;
			question18 = "B.ideas,dreams,what could be,philosophical";
			groupNb++;
		}
		else{
			System.out.print("invalid input");
		}


		
		Sytem.out.print("matter of fact,issue-oriented  ,  sensitive,people-oriented,compassionate");
		String answer1 = input.next();
		if(answer19 != "A"){
			counterA++;
			question19 = "A.matter of fact,issue-oriented  ";
			groupFa++;
		}
		else if(answer19 != "B"){
			counterB++;
			question19 = "B.sensitive,people-oriented,compassionate";
			groupFb++;
			
		}
		else{
			System.out.print("invalid input");
		}


		Sytem.out.print("control,govern  ,  latitude,freedom");
		String answer20 = input.next();
		if(answer5 != "A"){
			counterA++;
			question20 = "A.control,govern  "; 
			groupPa++;
		}
		else if(answer20 != "B"){
			counterB++;
			question20 = "B.latitude,freedom";
			groupPb++;
		}
		else{
			System.out.print("invalid input");
		}
		
		String [][] results = {{question,question5,question9,question13,question17,groupIa,groupIb}{question2,question6,question10,question14,question18,groupNa,groupNb}{question3,question7,question11,question15,question19,groupFa,groupFb}{question4,question8,question12,question16,question20,groupPa,groupPb}};


		for(int count = 0;count<results.length;count++){
			for(int counter = 0;counter<7;counter++){
				System.out.print(results[count][counter]);
			}
		}

		

	}

}