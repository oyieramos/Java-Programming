~~~~~~~~~~~~~~~~~~~~~~~~~~ repl.it
import java.util.*;

class Main {
  
  static int randomNumber;
  
  public static void main(String[] args){
    // System.out.println(addThem(5,7));
    // System.out.println(getRandomNum());
    // divideByZero(2);
    checkValidAge(-15);
  }
  
  public static int getRandomNum(){
    randomNumber = (int) (Math.random()*51);
    return randomNumber;
  }
  
  public static int addThem(int a, int b){
    int c = a+b;
    return c;
  }
  
  public static void tryToChange(int d){
    d = d + 1;
    System.out.println("tryToChange d = " + d);
  }
  
  public static void divideByZero(int a){
    try {
      System.out.println(a/0);
    } catch(ArithmeticException e){
      System.out.println(e.getMessage());
    }
  }
  
  public static void checkValidAge(int a){
    if(a <= 0){
      System.out.println("Your age is invalid");
    } else {
      System.out.println("Your age is valid");
    }
  }
  
}