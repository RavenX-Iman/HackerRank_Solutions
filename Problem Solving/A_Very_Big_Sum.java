import java.io.*;
import java.util.*;
import java.util.stream.*;

public class A_Very_Big_Sum {
    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0; // Initialize sum variable
        
        // Iterate through the list and add each element to sum
        for (int i = 0; i < ar.size(); i++) { 
            sum += ar.get(i); // add each element to sum
        }
        
        return sum; // Return the final sum
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim()); // Read the number of elements

        // Read input numbers, convert them to long, and store them in a list
        List<Long> ar = Stream.of(bufferedReader.readLine().trim().split(" "))
            .map(Long::parseLong)
            .collect(Collectors.toList());

        long result = aVeryBigSum(ar); // Call function to compute sum

        bufferedWriter.write(String.valueOf(result)); // Write the result to output
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
