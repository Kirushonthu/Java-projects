import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ATM{
  public static void main(String[]args){
    Scanner ks=new Scanner(System.in);
    System.out.print("Enter your name:");
    String name =ks.nextLine();
    
    ks.useDelimiter("\\n");
    int pin=1234;
    int balance=10000;
    
    System.out.println("Enter your PIN No:");
    
    int pin_no=ks.nextInt();
    if(pin_no==pin){
      System.out.println("login successful!!");
      int accNo = (int)(Math.random() * 900000) + 100000;
    System.out.println("Your Account No: " + accNo);
      System.out.println("WELCOME  "+name+"🙂");
      
      int select_opt;
      
      
        //check balance 
        //deposit 
        //withdraw 
        //exit 
        System.out.println("ATM menu");
        System.out.println("1.check balance");
        System.out.println("2.deposit");
        System.out.println("3.withdraw");
        System.out.println("4.exit");
        
        System.out.println("select your option:!!");
        do{
        select_opt=ks.nextInt();
      
      
      switch (select_opt){
         
         case 1:
           System.out.println("current Balance is:"+balance);
           break;
           
         case 2:
           System.out.println("Enter amount to deposit:");
           int deposit=ks.nextInt();
           balance+= deposit;
           System.out.println("amount deposited!! New Balance:"+balance);
            LocalDateTime now=LocalDateTime.now();
            DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            System.out.println("------ Receipt ------");
            System.out.println("Name: " + name);
            System.out.println("Account No: " + accNo);
            System.out.println("Transaction: Deposit");
            System.out.println("Amount: " + deposit);
            System.out.println("new balance amount:"+balance);
            System.out.println("Date: " + now.format(format));
            System.out.println("---------------------");
           break;
           
         case 3:
           System.out.println("Enter amount to withdraw:");
           int withdraw=ks.nextInt();
           if(balance>=withdraw){
             balance -= withdraw;
             System.out.println("withdrawal Successfully!! your remaining balance:"+balance);
        
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter fr = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("------ Receipt ------");
        System.out.println("Name: " + name);
        System.out.println("Account No: " + accNo);
        System.out.println("Transaction: Withdraw");
        System.out.println("Amount: " + withdraw);
        System.out.println("your current balance:"+balance);
        System.out.println("Date: " + time.format(fr));
        System.out.println("---------------------");
        } else {
        System.out.println("Insufficient balance!!!");
        }
          break;
          
           
         case 4:
            System.out.println("exited");
            System.out.println("Thank you for using our ATM. Goodbye!");
             break;
           
          default:
          System.out.println("invalid please try again!!!");
          break;
        
      
      }
      }
      while (select_opt!=4);
      
    }
      else{
        System.out.println("incorrect pin!!! access denied");
      }
  }
}