public class Ksh{
  /* functions and parameters or arguments with 
  return values 
  >>in div() function c returns value 94 that will come 
  to ks.div so assign value hi to store the return value then print it!!
  */
  int sum(int a,int b){
    System.out.println(a+b);
    return 1;
  }
  void sub(int a,int b){
    System.out.println(a-b);
  }
  double mul(int a,int c){
   double b=a*c;
    System.out.println(a*c);
    System.out.println(b);
    return 3;
  }
  int div(){
   int a=100;
   int b=6;
   int c= a-b;
   System.out.println(c);
    return c;
  }
  public static void main (String[] args){
   Ksh ks= new Ksh();
   int remain= ks.sum(2,3);
   System.out.println(remain);
    ks.sub(4,5);
 double remaining =  ks.mul(6,7);
    System.out.println(remaining);
   int hi = ks.div();
   System.out.println(hi);
  }
}