import java.util.Scanner;
  //compound interest calculator 
public class Main {
    public static void main(String[] args) {
      /*
      A = P(1 + r/n)^nt
A	=	final amount
P	=	initial principal balance
r	=	interest rate
n	=	number of times interest applied per time period
t	=	number of time periods elapsed */
   Scanner scan=new Scanner(System.in);
   
   double principal;
   double amount;
   double rate;
   int year; //t
   int timecompounded;//n
   
   System.out.println("Enter principal amount:");
   principal=scan.nextDouble();
   
   System.out.println("Enter rate of interest:");
   rate=scan.nextDouble() /100;
   
   System.out.println("Enter year:");
   year=scan.nextInt();
   
   System.out.println("Enter time compounded");
   timecompounded=scan.nextInt();
   
   amount= principal*Math.pow(1+rate / timecompounded , timecompounded*year);
   
   //System.out.println("the amount after "+year+" years is " +amount);
   System.out.printf("The amount after %d years is ₹%.2f\n", year, amount);
scan.close();
  }
}