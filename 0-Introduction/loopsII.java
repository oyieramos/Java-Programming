~~~~~~~~~~~~~~~~~~~~~~~~~ Loops II
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int ans = a;
          for(int ii = 0; ii < n; ii++){
            ans += (int)(Math.pow(2, ii)*b);
            System.out.format(ans + " ");
          }          
            System.out.format("\n");
        }
        in.close();
    }
}