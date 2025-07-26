import java.util.Scanner;
     // weight converter lbs to kgs ...><...
public class Main {
    public static void main(String[] args) {
      
      double weight;
      double netweight;
      int choice;
      
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your choice:");
      
      System.out.println("1.convert weight into lbs:");
      System.out.println("2.convert weight into kgs:");
      
      choice=scan.nextInt();
      
      if(choice==1){
        System.out.println("Enter weight in kgs:");
        weight=scan.nextDouble();
        netweight=weight*2.20462;
        System.out.printf("weight in lbs is : %.2f lbs\n" ,netweight);
      }
      else if(choice==2){
        System.out.println("Enter weight in lbs;");
        weight=scan.nextDouble();
        netweight=weight*0.453593;
        System.out.printf("weight in kgs is: %.2f kg\n" ,netweight);
      }
      else {
        System.out.println("Enter valid option!!");
      }
  }
}