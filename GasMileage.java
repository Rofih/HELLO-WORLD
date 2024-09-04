import java.util.Scanner;
public class GasMileage{
	public static void main(String[] args){
           Scanner input=new Scanner(System.in);
           System.out.print("Enter the number of trips:");
           int trip = input.nextInt();
           int totalMilesPerGallon = 0;
           
           for(int triper=0;triper<trip;triper++){
           System.out.println("Enter the miles driven:");
           int mile = input.nextInt();
          //mile+=mile ;
           System.out.println("Enter the gallons used:");
           int gallon = input.nextInt();
           //gallon+=1;
           float milesPerGallon = mile/gallon;
           System.out.println(milesPerGallon);

	   totalMilesPerGallon += milesPerGallon;
           
           //totalmiles+=mile;
           //System.out.println(totalmiles);

        }

           System.out.printf("the total miles per gallon is %d",totalMilesPerGallon);
	}
}