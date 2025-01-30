import java.util.*;  // Import the Scanner class to take user input
public class stdin_stdout {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in); // Create a Scanner object to read input from the user
        
        // Read integer input from the user
         int a = S.nextInt();
         int b = S.nextInt();
         int c = S.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        S.close();
    }
}

