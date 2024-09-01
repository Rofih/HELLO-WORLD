public class trianglePattern{
  public static void main(String[] args){
  multiplyStar();
 }

     public static void printStar(){
       System.out.print("* ");

     }
   public static void Space(){
      System.out.println();
   }

   public static void multiplyStar(){
     for(int count=1;count<=5;count++)
         System.out.print(printStar());
         Space();
   } 
   
   public static void Pattern(){
    printStar();
    Space();

    printStar();
    printStar();
    Space();

    printStar();
    printStar();
    printStar();
    Space();

    printStar();
    printStar();
    printStar();
    printStar();
    Space();

    printStar();
    printStar();
    printStar();
    printStar();
    printStar();
    Space();
}

   public static void Pattern2(){
    
    printStar();
    printStar();
    printStar();
    printStar();
    printStar();
    Space();

    printStar();
    printStar();
    printStar();
    printStar();
    Space();


    printStar();
    printStar();
    printStar();
    Space();

    printStar();
    printStar();
    Space();

    printStar();
    Space();
   
    

  }
}

