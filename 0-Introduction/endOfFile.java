~~~~~~~~~~~~~~~~~~~~~~~~~~ End-of-file
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      int i = 1;
      while(scan.hasNextLine()){
        String str = scan.nextLine();
        System.out.format(i + " " + str + "\n");
        i++;
      }
    }
}