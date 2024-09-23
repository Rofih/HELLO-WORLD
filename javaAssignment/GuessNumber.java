import java.util.Scanner;
import java.util.Random;
public class GuessNumber {

	public static void main(String[] args){
		
		System.out.print("Your welcome to my guessing game");
		
		guessNumber();

}
	public static void guessNumber(int guess){
		Scanner input = new Scanner(System.in);
		Random random = new Random();

		int number = random.nextInt(1000) +1;

		//int  guess = 0;
		while(guess != number) {
   		System.out.println("guess a number between 1-1000:");
   		//int guess=input.next();

		if (guess > number) {
    			System.out.println("guess is too high try again");
}
   		else if (guess < number) {
       			System.out.println(" guess is too low try again");
}
    		else  {

			System.out.println("Congratulations!: " + number);
        }

     }
     
   }
}