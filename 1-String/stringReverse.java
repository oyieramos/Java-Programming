~~~~~~~~~~~~~~~~~~~~~~~~~~ String reverse
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String newA = "";
      
      for(int i = A.length() - 1; i >= 0; i--){
        newA = newA + A.charAt(i);
      }
      
      if(A.equals(newA)){
        System.out.print("Yes");
      } else {
       System.out.print("No");
      }
        
    }
}
