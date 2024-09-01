import java.util.Scanner;  

public class Kata{
   public static void (String[] args){
    
    }

public static boolean isEven(int number){
     
     return number % 2==0;
       
   }
     
     public static boolean isPrimenumber(int number){
		int factors = 0; 
		for(int count = 1;count <= number; count++){
			if(number%count==0) 
				factors++;
		}
		return factors==2;
			
		
		       
	           
}

public static int isSubtract(int number1, int number2){
     

       if(number1>number2)
          return number1-number2;
      else 
        return  number2 - number1;
}

public static int isDivide(int number1,int number2){
     
      if(number2==0)return 0;

      int answer = number1/number2;
      

      return answer;
 }

public static boolean palindrome(int value){
         
        
         int number=value;
         int value1=number%10;
         int value2=number%100;
         int value3=number/10;
         int value4=value3%100;
         int value5=value3/100;

      
      return value1==value5;
                
            
}


 public static int SquareOf(int value){
      
      int answer = value*value;
      return answer;


}
   
}