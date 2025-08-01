import java.util.Scanner;
import java.util.Random;
//rock paper scissors 
public class Main {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      Random random=new Random();
      String[] choices={"rock","paper","scissors"};
      String yourchoice;
      String comchoice;
      String playagain ="yes";
      do{
        
      
      System.out.println("Enter your choice (rock paper scissors):");
      yourchoice=scan.nextLine().toLowerCase().trim();
      
      if(!yourchoice.equals("rock")&&
        !yourchoice.equals("paper")&&
        !yourchoice.equals("scissors")){
          System.out.println("Invalid choice!!");
          continue;
        }
        
        comchoice=choices[random.nextInt(3)];
        System.out.println("computer choice: "+comchoice);
      
      if(yourchoice.equals(comchoice)){
        System.out.println("its a tie!!");
      }
     else if((yourchoice.equals("rock") && comchoice.equals("scissors")) ||
                (yourchoice.equals("paper") && comchoice.equals("rock")) ||
                (yourchoice.equals("scissors") && comchoice.equals("paper"))){
        System.out.println("you win!");
       }
       else {
      System.out.println("you lose!!!");
      }
      System.out.println("play again (yes/no) :");
      playagain=scan.nextLine().toLowerCase();
      
      
  }while(playagain.equals("yes"));
  System.out.println("Thanks for playing noobita*!!");
  scan.close();
    }
    
}