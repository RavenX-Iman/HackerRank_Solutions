import java.util.*;

public class NumberLineJumps {

    // Function to check if the kangaroos meet
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 > v2 && (x2 - x1) % (v1 - v2) == 0) {
            return "YES";
        } 
        if (x1 == x2) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        // Scanner for input
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int x1 = scanner.nextInt();
        int v1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int v2 = scanner.nextInt();

        // Call function and print result
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);

        // Close scanner
        scanner.close();
    }
}
