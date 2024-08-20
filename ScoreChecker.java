import java.util.Scanner;
public class ScoreChecker{
    public static void main(String[] args)
   {
     Scanner input=new Scanner(System.in);
   
     int cutoff = 50;
     int pass=1;
     int fail=1;

     for(int count=1; count<3; count++){

      System.out.print("Enter the Testscore :");
      int TestScore = input.nextInt();

      if(TestScore >= cutoff){
		System.out.println("Pass"); 
        	pass++;
	} else {
		System.out.println("Fail");
        	fail++;
	       }
   
   }
   
     System.out.printf("Number of people that failed :%d%n", fail);
   
     System.out.printf("Number of people that pass:%d", pass);
 }

}

