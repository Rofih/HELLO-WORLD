import java.util.Scanner;
public class Pizza{
	public static void main(String[] args){
	  Scanner input=new Scanner(System.in);
          System.out.print("Your welcome to Iya Afeez pizza joint Ajegunle");
          System.out.print("\n Please enter the number of people serving:");
          int number=input.nextInt();
          
           String list=
           These is our pizza menu list :
           PIZZA TYPE   NO.OF SLICES  PRICE PER BOX
           1-Sapa size      4            2000
           2-Small money    6            2400
           3-Big boys       8            3000
           4-Odogwu         12           4200
            
           '''''';
            System.out.print(list);
          System.out.print("Enter your pizza type:");
          int type=input.nextInt();

          switch (type){
                 case 1:
                        {if(number<=sapaSize)
                {System.out.print(price1);}
           }


          
          int sapaSize=4;
          int smallMoney=6;
          int bigBoys=8;
          int odogwu=12;

           int price1=2000;
           int price2=2400;
           int price3=3000;
           int price4=4200;

           if(number<=sapaSize)
                {System.out.print(price1);}
           if(smallMoney%number==1)
              {System.out.print(price2);}  

           if(number<=smallMoney)
            {System.out.print(price2);}

           if(number<=bigBoys)
             {System.out.print(price3);}
           if(number<=odogwu)
               {System.out.print(price4);}
           if(number%odogwu==0){
               int value=number/12;
               int amount=value*4200;
               System.out.print(amount);}

            int rem =1;
           if(number%12>=rem)
              
             {System.out.printf("slices left are ",rem);}

           

           
           
   





	}
}