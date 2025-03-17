import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Step 1: Find LCM of the first array
        int lcmA = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            lcmA = lcm(lcmA, a.get(i));
        }

        // Step 2: Find GCD of the second array
        int gcdB = b.get(0);
        for (int i = 1; i < b.size(); i++) {
            gcdB = gcd(gcdB, b.get(i));
        }

        // Step 3: Count numbers that are multiples of LCM(a) and factors of GCD(b)
        int count = 0;
        for (int i = lcmA; i <= gcdB; i += lcmA) { //
            if (gcdB % i == 0) {
                count++;
            }
        }

        return count;
    }
    
    // Helper function to calculate GCD (Greatest Common Divisor)
    private static int gcd(int a, int b) { 
        while (b != 0) { //loop until b becomes 0
            //swaping a & b
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Helper function to calculate LCM (Least Common Multiple)
    private static int lcm(int a, int b) {//function to calculate lcm of 2 numbers
        return (a * b) / gcd(a, b);//returns the lcm of a & b
    }
}

public class Between_Two_Sets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out)); // Console Output

        // Read first line (n and m)
        String[] firstMultipleInput = bufferedReader.readLine().trim().split(" ");

        // Validate input to prevent IndexOutOfBoundsException
        if (firstMultipleInput.length < 2) {
            System.out.println("Error: Expected two integers for n and m.");
            return;
        }

        int n = Integer.parseInt(firstMultipleInput[0]);
        int m = Integer.parseInt(firstMultipleInput[1]);

        // Read first array
        List<Integer> arr = Stream.of(bufferedReader.readLine().trim().split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        // Read second array
        List<Integer> brr = Stream.of(bufferedReader.readLine().trim().split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        // Ensure both lists are not empty
        if (arr.isEmpty() || brr.isEmpty()) {
            System.out.println("Error: Both arrays must contain elements.");
            return;
        }

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
