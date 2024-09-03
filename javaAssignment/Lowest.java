import java.util.Scanner;
	public class Lowest{
               public static void main(String[] args){
                Scanner input=new Scanner(System.in);
                System.out.print("Enter number of students");
                int userInput=input.nextInt();
                 

                for(int count=0;count<userInput;count++){
                System.out.print("Enter students name: ");
                String name=input.next();
                System.out.print("Enter students score: ");
                int score=input.nextInt();
               

                int firstLowest=0;
                int secondLowest=0;
                String userName="";
                if(count=1){
                  firstLowest=score;
                  userName=name;
                 }
                 if(firstLowest<secondLowest){
                   System.out.print(secondLowest);
                 }else{
                    Ststem.out.print(firstLowest);

}




}
                
                



               }

	       }
	}