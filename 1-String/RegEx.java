~~~~~~~~~~~~~~~~~~~~~~~~~~ RegEx
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }

}

class MyRegex{
	private String part = "((25[0-5])|(2[0-4][0-9])|([0-1]{0,1}[0-9]{1,2}))";
	// (250 - 255) | (200 - 249) | (0-1) in zero or first index with (0-9) in 1st to third index
	String pattern = String.format("%s\\.%s\\.%s\\.%s", part, part, part, part);
}



/*
Write a class called MyRegex which will contain a string pattern. You
need to write a regular expression and assign it to the pattern such
that it can be used to validate an IP address. Use the following
definition of an IP address:

*/
