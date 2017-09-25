~~~~~~~~~~~~~~~~~~~~~~~~~~ try -> catch
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
      Scanner scan = new Scanner(System.in);
      try{
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println(x/y);
      } catch (InputMismatchException e){
      	//added this because it did not want to specify the mismatch
        System.out.println("java.util.InputMismatchException");
      } catch (Exception e){
        System.out.println(e);
      }
      
    }
  
}