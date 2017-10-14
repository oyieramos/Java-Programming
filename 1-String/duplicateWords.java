import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            // num --> 0 has a built in -= 1 or --
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
            numSentences--;
        }
        
        in.close();
    }
}

/*
In this challenge, we use regular expressions (RegEx) to remove
instances of words that are repeated more than once, but retain
the first occurrence of any case-insensitive repeated word. For
example, the words love and to are repeated in the sentence I love
Love to To tO code. Can you complete the code in the editor so it
will turn I love Love to To tO code into I love to code?

save string of previous word and if matches with current word
toLowerCase() and remove repeated words

Constraints
Each sentence consists of at most  English alphabetic letters and
whitespaces.
1 <= n <= 100

*/
