import java.util.Scanner;
public class output_formatting {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        // Print a line of equal signs as a separator
        System.out.println("================================");

        // Run a loop 3 times to take input and format output
        for (int i = 0; i < 3; i++) {
            // Read a string input from the user
            String s1 = sc.next();
            // Read an integer input from the user
            int x = sc.nextInt();

            // Print the formatted output:
            // %-15s  → Left-align the string within 15 spaces
            // %03d   → Format the integer as a 3-digit number with leading zeros if necessary
            // %n     → New line character (similar to println)
            System.out.printf("%-15s%03d%n", s1, x);
        }

        // Print another separator line
        System.out.println("================================");

        // Close the scanner to prevent resource leaks
        sc.close();
    }
}

    

