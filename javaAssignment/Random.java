import java.util.Scanner;
import java.util.Random;
public class Random {

public static void main(String[] args){

Random random = new Random();

int number = random.nextInt(10) +1;


Scanner input = new Scanner(System.in);


int  guess = 0;

for(int attempt = 3;attempt < 4;attempt++){
while(guess != number) {
   System.out.println("enter any number(from 1- 10):");
   guess = input.nextInt();

if (guess > number) {
    System.out.println("guess is too high try again");
}
   else if (guess < number) {
       System.out.println(" guess is too low try again");
}
    else  {

	System.out.println("this guess is correct: " + number);
        }

     }
     }
   }
}