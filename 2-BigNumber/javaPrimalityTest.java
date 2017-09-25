import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      in.close();     
      System.out.println(n.isProbablePrime(1) ? "prime" : "not prime");
      //still fiddling about the certainty
      // bigIntegerVariable.isProbablePrime() will return true on prime nos.
   }
}
