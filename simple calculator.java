import java.util.Scanner;
 //simple calculator 

public class Main {
    public static void main(String[] args) {
      
      Scanner scan=new Scanner(System.in);
      
      double num1;
      double num2;
      char operand;
      double result=0;
      Boolean isValid=true;
      
      System.out.println("Enter the num1: ");
      num1=scan.nextDouble();
       System.out.println("Enter the operation(+,-,*,/,^: ) ");
       operand=scan.next().charAt(0);
       System.out.println("Enter the num2: ");
       num2=scan.nextDouble();
       
       switch(operand){
         
         case '+' -> {
           result=num1+num2;
         }
         
         case '-' -> {
           result=num1-num2;
         }
         
         case '*' -> {
           result=num1*num2;
         }
         
         case '/' -> {
           if(num2==0){
             System.out.print("zero cant be divided!!");
             isValid=false;
           }
             else{
               result=num1/num2;
             }
           
         }
         
         case '^' -> {
           result=Math.pow(num1,num2);
         }
         
         default -> {
           System.out.print("Invalid oprator!!");
           isValid=false;
         }
         
       }
       if(isValid){
       System.out.print(result);
  }
    }
}