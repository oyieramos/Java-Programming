~~~~~~~~~~~~~~~~~~~~~~~~~~ BigNumber -> BigInteger
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scan = new Scanner(System.in);
      BigInteger a = new BigInteger(scan.next()); 
      BigInteger b = new BigInteger(scan.next());
      
      BigInteger sum = a.add(b);
      BigInteger prod = a.multiply(b);
      
      System.out.format(sum + "\n" + prod);
    }
}