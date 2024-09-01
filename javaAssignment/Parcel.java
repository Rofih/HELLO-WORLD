import java.util.Scanner; 
public class Logistic{
     public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       int number=input.nextInt();
       service(number);
}


public static int service(int value){
    if(value<50){
   int poor=(value*160)+5000;
   return poor;

}
int upper=59;
int lower=50;
   if(lower<=value<=upper){
int rich=(value*200)+5000;
   return rich;
}
int high=69;
int low=60;
   if(60<=value<=69){
int frosh=(value*250)+5000;
   return frosh;
}

  if(value>=70){
int oga=(value*500)+5000;
   return oga;

}


}

}