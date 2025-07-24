import java.util.Random;

//rolling a dice or genrate random number 

public class Main {
    public static void main(String[] args) {
      
      Random random = new Random();
      int dice1;
      //double dice2;
      int dice2;
      
      dice1= random.nextInt(1,7);
      System.out.println(dice1);
      dice2=random.nextInt(1,7);
      System.out.println(dice2);
      
  }
}