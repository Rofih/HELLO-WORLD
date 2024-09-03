import java.util.Scanner;
public class Patterns{
	public static void main(String[] args){
        userInput(size);
	}

         public static void userInput(){
           Scanner input=new Scanner(System.in);
           int userInput=input.nextInt();
           int size = userInput;

        }


        public static void Pattern1(){
	  for (int count = 1;count<=size;count++){
	     System.out.println(""); 
	     for (int counter = 1;counter<=count;counter++){
	          System.out.print(" * ");
	
	  }
	    }
        }
        public static void Pattern2(){
	  for (int count = 1; count<=size;count++){
	     System.out.println (" ");
	    for (int counter = 0; counter<=count;counter++){	
	      System.out.print(" * ");
	  }
	     } 
        }
}