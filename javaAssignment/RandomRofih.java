import java.util.Scanner;
import java.util.Random;
public class RandomRofih {

public static void main(String[] args){

Random random = new Random();

int number = random.nextInt(10) +1;


Scanner input = new Scanner(System.in);

int count = 0;
int  guess = 0;


while(guess != number) {
   System.out.println("enter any number(from 1- 10):");
   guess = input.nextInt();
   count++;
   if (guess > number) {
    System.out.println("is too high try again");
}
   else if (guess < number) {
       System.out.println("is too low try again");
}
    else  {

	System.out.println(" it is correct: " + number);break;
        }
    //for(;count<=3;)
    
    if(count%3==0){System.out.println("the number has changed");}
    number = random.nextInt(10) +1;     
     }
   }
}