import java.util.Scanner;
import java.util.Random;
  //java slot machine 
public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int balance=100;
      int bet;
      int payout;
      String playagain;
      String[] row;
      System.out.println("*****************************");
      System.out.println("   Welcome to java slot!   ");
      System.out.println(" symbols--> 🍒 🍉 🍋 🔔 ⭐");
      System.out.println("*****************************");
      while(balance>0){
        System.out.println("Current balance ₹ "+ balance);
        System.out.println("Enter bet amount ₹ ");
        bet=scan.nextInt();
        scan.nextLine();
        if(bet>balance){
          System.out.println("Insufficient balance!!");
          continue;
        }
        else if(bet<=0){
          System.out.println("bet must be greater than 0!");
          continue;
        }
        else{
          balance-= bet;
        }
        System.out.println("spinning....");
        row=spinrow();
        printrow(row);
       payout = getpayout(row,bet);
       
       if(payout>0){
         System.out.println("you won₹ "+ payout);
         balance+=payout;
       }else{
         System.out.println("you lose this round!!");
       }
       
       System.out.println("do you want to play again!(Y/N)");
       playagain= scan.nextLine().toUpperCase();
       if(!playagain.equals("Y")){
         break;
       }
      }
      System.out.println("GAME OVER!! your final balance is ₹: "+ balance);
      
      
    }
    static String[] spinrow(){
      String[] symbols= {"🍒", "🍉", "🍋", "🔔","⭐"};
      String[] row=new String[3];
      Random rand =new Random();
      
      for(int i=0;i<3;i++){
        row[i]=symbols[rand.nextInt(symbols.length)];
      }
      
    
      return row;
    }
    static void printrow(String[] row){
      System.out.println("******************");
      System.out.println(" " +String.join(" | ", row));
      System.out.println("******************");
    }
    static int getpayout(String[]row,int bet ){
      if(row[0].equals(row[1])&& row[1].equals(row[2])){
       return switch(row[0]){
         case "🍒"-> bet*3;
         case "🍉"-> bet*4;
         case "🍋"-> bet*5;
         case "🔔"-> bet*10;
         case "⭐"-> bet*20;
         default -> 0;
      };}
        else if(row[0].equals(row[1])){
       return switch(row[0]){
         case "🍒"-> bet*2;
         case "🍉"-> bet*3;
         case "🍋"-> bet*4;
         case "🔔"-> bet*6;
         case "⭐"-> bet*10;
         default -> 0;
      };}
      else if (row[1].equals(row[2])){
       return switch(row[1]){
         case "🍒"-> bet*2;
         case "🍉"-> bet*3;
         case "🍋"-> bet*4;
         case "🔔"-> bet*6;
         case "⭐"-> bet*10;
         default -> 0;
      };}
      return 0;
    
}
}





