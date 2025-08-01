import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scan =new Scanner(System.in);
      String[] questions={"Which keyword is used to define a class in Java?",
                          "What is used to terminate a statement in Java?",
                          "Which method is the entry point of a Java program?",
                          "What does == check in Java?",
                          "Which loop runs at least once?"};
      String[][] options={{"1. def","2. class","3. create"},
                          {"1. ,","2. :","3. ;"},
                          {"1. main","2. start","3. run"},
                          {"1. type","2. value","3. length"},
                          {"1. for","2. while","3. do while"}};
       int[] answers={2,3,1,2,3};
       int guess;
       int score=0;
       int i=0;
       System.out.println("**********************");
       System.out.println("Welcome to Java Quiz!!");
       System.out.println("**********************");
     /*  for(int i=0;i<=questions.length;i++){
         System.out.println(questions[i]); }*/
         for(String question: questions){
           System.out.println();
           System.out.println(question);
          for(String option : options[i]){
            
              System.out.println(option); 
            
          }
          System.out.print("Guess the answer/1/2/3: ");
          guess=scan.nextInt();
          if(guess==answers[i]){
            System.out.println("CORRECT!");
            score++;
          }else{
            System.out.println("WRONG!! correct answer is: "+answers[i]);
         }
       i++;
      
    }
    scan.close();
    System.out.println();
    System.out.println("**************");
    System.out.println("Your score is: "+score+" out of "+questions.length+"--->"+score+"/"+questions.length);
    System.out.print("**************");
  
}}