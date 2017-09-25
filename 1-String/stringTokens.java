~~~~~~~~~~~~~~~~~~~~~~~~~~ String Tokens
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String []a = scan.nextLine().trim().split("[^a-zA-Z]+");
                                        // .split("[ !,?._'@]+",0);
        scan.close();
      
      if(a.length == 0){
        System.out.println(0);
        System.out.println("");
        return;
      }
      
      System.out.println(a.length);
      for(int i = 0; i < a.length; i++){
        System.out.println(a[i]);
      }
            
    }
}// still cannot solve Test Case #9