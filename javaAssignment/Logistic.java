import java.util.Scanner; 
public class Logistic{
     public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       System.out.print("Enter the number of deliveries:");
       int number=input.nextInt();
       service(number);
}


public static void service(int value){
    if(value<50){
   int poor=(value*160)+5000;
   System.out.print(poor); 

}
int higher=59;
int lower=50;
   if(value>lower&&value<higher){
int rich=(value*200)+5000;
   System.out.print(rich); 
}
int high=69;
int low=60;
   if(value>low&&value<high){
int frosh=(value*250)+5000;
   System.out.print(frosh);
}

  if(value>=70){
int oga=(value*500)+5000;
   System.out.print(oga); 

}


}

}