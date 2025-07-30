import java.util.Scanner;
import java.util.Random;
   //dice roller 

public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      Random random =new Random();
      int numofdice;
      int total=0;
      
      System.out.println("How many # times you want to roll:");
      numofdice =scan.nextInt();
      if(numofdice>0){
         for(int i=0;i<numofdice;i++){
           int roll=random.nextInt(1,7);
           die(roll );
           System.out.println("you rolled"+roll);
           total+=roll;
         }
           System.out.println("Total: "+total);
           
         
        
      }
      else{
        System.out.println("# times must be Greater than 0");
      }
      scan.close();
  }
  static void die(int roll){
    String dice1=""" 
       -------
      |       |
      |   ♦   | 
      |       |
       -------
    """;
String dice2=""" 
       -------
      | ♦     |
      |       | 
      |     ♦ |
       -------
    """;
String dice3=""" 
       -------
      | ♦     |
      |   ♦   | 
      |     ♦ |
       -------
    """;
String dice4=""" 
       -------
      | ♦   ♦ |
      |       | 
      | ♦   ♦ |
       -------
    """;
String dice5=""" 
       -------
      | ♦   ♦ |
      |   ♦   | 
      | ♦   ♦ |
       -------
    """;
String dice6=""" 
       -------
      | ♦   ♦ |
      | ♦   ♦ | 
      | ♦   ♦ |
       -------
    """;
  
    switch(roll){
      
case 1 ->System.out.print(dice1);
case 2 ->System.out.print(dice2);
case 3 ->System.out.print(dice3);
case 4 ->System.out.print(dice4);
case 5 ->System.out.print(dice5);
case 6 ->System.out.print(dice6);
default -> System.out.print("invalid role!");
    }
  }
}
    

    
  
