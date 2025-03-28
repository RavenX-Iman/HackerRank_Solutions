import java.util.*;

public class Java_String_Tokens {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim(); // Remove leading/trailing spaces

        // Handle edge case: Empty input
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        // Split using regex to remove non-alphabetic characters
        // ^ is used to negate the character class, so [^A-Za-z] matches any non-alphabetic character
        //A-z matches any alphabetic character (both upper and lower case)
        // + means one or more occurences of preceding character or consecutive characters
        String[] tokens = s.split("[^A-Za-z]+");

        // Handle case where split still returns an empty string
        if (tokens.length == 1 && tokens[0].isEmpty()) {
            System.out.println(0);
            return;
        }

        // Print the number of tokens
        System.out.println(tokens.length);

        // Print each token
        for (String token : tokens) {
            System.out.println(token);
        }
    sc.close();
    }
}
