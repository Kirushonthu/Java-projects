import java.util.Scanner;
//temprature converter 
public class Main {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      
      double temp;
      double newtemp;
      String unit;
      
      System.out.println("Enter temprature: ");
      temp=scan.nextDouble();
      System.out.println("convert celsius or fahrenheit (C or F)");
      unit=scan.next().toUpperCase();
      newtemp=unit.equals("C") ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;
      System.out.printf("converted temperature: %.2f°%s",newtemp,unit);
      scan.close();
  }
}