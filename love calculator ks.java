import java.lang.System;
import java.util.Scanner; 

class love_calculator{
  
  public static void main (String args[]){
  
  Scanner scan=new Scanner(System.in);
  love_calculator ks= new love_calculator();
  
  System.out.println("love calculator between lovers");
  System.out.println("Enter your Name and your lover name");
  
  String name1= scan.nextLine();
  String name2= scan.nextLine();
  
  System.out.println(name1);
  System.out.println(name2);
  

 System.out.println("timeyoutalk");
   int timeyoutalk= scan.nextInt();
   float obj1=((float)timeyoutalk/24)*100;
 System.out.println(obj1);
 timeyoutalk=(int)obj1;
  System.out.println("Your love towards them");
  
  if(timeyoutalk>=100)
  {
    System.out.println("Your very lucky to have them");
  }
  else if(timeyoutalk>=75)
   {
     System.out.println("your doing well ,talk more");
   }
   else if(timeyoutalk>=50)
   {
     System.out.println("spend some more time with them");
   }
   else
   {
     System.out.println("your need to talk and spend moree time with them");
   }
   
  }
}