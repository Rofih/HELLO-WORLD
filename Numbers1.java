import java.util.Scanner;
public class Numbers1{

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
   
    System.out.print("Enter firstNumber:");
    int firstNumber = input.nextInt();
    int largest = firstNumber;
    int smallest = firstNumber;
    

    while{
    int largestNumber = firstNumber;



    if(firstNumber>largestNumber)
      largestNumber=firstNumber;

    if(firstNumber<largestNumber)
      largestNumber=firstNumber;

    System.out.printf("largestNumber is %d",largestNumber); 
   
   }
}
   }








